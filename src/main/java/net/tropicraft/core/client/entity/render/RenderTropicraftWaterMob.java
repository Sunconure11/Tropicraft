package net.tropicraft.core.client.entity.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.tropicraft.core.common.entity.underdasea.atlantoku.EntityTropicraftWaterBase;

public abstract class RenderTropicraftWaterMob extends RenderLiving<EntityTropicraftWaterBase> {

	public RenderTropicraftWaterMob(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}

	public void renderWaterMob(EntityTropicraftWaterBase entityliving, double d, double d1, double d2, float f1) {
		this.renderWaterMob(entityliving, d, d1, d2, f1, 0, 0);
	}

	public void renderWaterMob(EntityTropicraftWaterBase entityliving, double posX, double posY, double posZ,
			float delta, float yawOffset, float pitchOffset) {
		float swimYaw = (entityliving.prevSwimYaw + yawOffset)
				+ ((entityliving.swimYaw + yawOffset) - (entityliving.prevSwimYaw + yawOffset)) * delta;
		float swimPitch = (entityliving.prevSwimPitch + pitchOffset)
				+ ((entityliving.swimPitch + pitchOffset) - (entityliving.prevSwimPitch + pitchOffset)) * delta;

		if (swimPitch <= -45) {
			swimPitch = -45;
		}
		

		GlStateManager.pushMatrix();

		GlStateManager.disableCull();

		if(!entityliving.isInWater() && !entityliving.isInGui) {
			entityliving.outOfWaterTime++;
			if(entityliving.outOfWaterTime > 90) {
				entityliving.outOfWaterTime = 90;
			}
		}else {
			if(entityliving.outOfWaterTime > 0) {
				entityliving.outOfWaterTime--;
			}
		}

		GlStateManager.translate(posX, posY, posZ);

		if (entityliving.hurtTime > 0) {
			GlStateManager.color(1f, 0f, 0f, 1f);
		}

		GlStateManager.rotate(swimYaw + 180, 0F, 1.0F, 0.0F);
		GlStateManager.rotate(swimPitch, 1.0F, 0.0F, 0.0F);
		
		float rot = 0F;
		if (entityliving.outOfWaterTime< 91) {
			rot = (float) entityliving.outOfWaterTime;
		} else {
			rot = 90F;
		}
		GlStateManager.rotate(rot, 0.0F, 0.0F, 1.0F);
		
		float f6 = 0.0625F;
		GlStateManager.enableNormalize();
		GlStateManager.scale(-1f, -1f, 1f);
		preRenderCallback(entityliving, delta);

		GlStateManager.translate(0.0F, -24F * f6 - 0.0078125F, 0.0F);
		float f7 = 0f;
		float f8 = 0f;
		if (entityliving.isChild()) {
			f8 *= 3F;
		}
		if (f7 > 1.0F) {
			f7 = 1.0F;
		}
		GlStateManager.enableAlpha();
		mainModel.setLivingAnimations(entityliving, f8, f7, delta);
		renderModel(entityliving, f8, f7, handleRotationFloat(entityliving, delta), swimYaw, swimPitch, 0.0625f);
		GlStateManager.color(1f, 1f, 1f, 1f);

		GlStateManager.popMatrix();
		if (Minecraft.getMinecraft().pointedEntity != null) {
			if (Minecraft.getMinecraft().pointedEntity.equals(entityliving)) {
				if (entityliving.getCustomNameTag().length() > 0) {
					renderEntityName(entityliving, posX, posY, posZ, entityliving.getCustomNameTag(), 32D);
				}
			}
		}
	}
}
