package net.tropicraft.client.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.tropicraft.entity.underdasea.EntitySeahorse;
import net.tropicraft.util.TropicraftUtils;

import org.lwjgl.opengl.GL11;

public class RenderSeahorse extends RenderLiving {

	public RenderSeahorse(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	@Override
    public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderSeahorse((EntitySeahorse)par1EntityLiving, par2, par4, par6, par8, par9);
    }
	
	private void renderSeahorse(EntitySeahorse seahorse, double x, double y, double z, float f, float f1) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y - 2.2, z);
		super.doRender(seahorse, x, y, z, f, f1);
		GL11.glPopMatrix();
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		EntitySeahorse seahorse = null;
		
		if (entity instanceof EntitySeahorse)
			seahorse = (EntitySeahorse)entity;
		
		if (seahorse == null)
			return TropicraftUtils.bindTextureEntity("seahorse/razz");
		else
			return TropicraftUtils.bindTextureEntity(String.format("seahorse/%s", seahorse.getColorName()));
	}

}
