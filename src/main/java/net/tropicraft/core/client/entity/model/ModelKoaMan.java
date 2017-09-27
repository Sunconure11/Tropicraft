package net.tropicraft.core.client.entity.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelKoaMan extends ModelBiped {

    /*public ModelRenderer bipedHead;
    public ModelRenderer bipedBody;
    public ModelRenderer bipedRightArm;
    public ModelRenderer bipedLeftArm;
    public ModelRenderer bipedRightLeg;
    public ModelRenderer bipedLeftLeg;*/
    public ModelRenderer headband;
    public ModelRenderer armbandR;
    public ModelRenderer leaf;
    public ModelRenderer leaf3;
    public ModelRenderer leaf2;
    public ModelRenderer leaf4;
    public ModelRenderer leaf5;
    public ModelRenderer leaf6;
    public ModelRenderer leaf7;
    public ModelRenderer leaf8;
    public ModelRenderer leaf9;
    public ModelRenderer leaf10;
    public ModelRenderer armbandL;

    public ModelKoaMan() {
        
        //textureWidth = 64;
        //textureHeight = 32;
        
        bipedHead = new ModelRenderer(this, 0, 2);
        bipedHead.addBox(-4F, -8F, -4F, 8, 8, 8);
        bipedHead.setRotationPoint(0F, 0F, 0F);
        bipedHead.setTextureSize(64, 32);
        bipedHead.mirror = true;
        setRotation(bipedHead, 0F, 0F, 0F);
        /*bipedBody = new ModelRenderer(this, 16, 16);
        bipedBody.addBox(-4F, 0F, -2F, 8, 12, 4);
        bipedBody.setRotationPoint(0F, 0F, 0F);
        bipedBody.setTextureSize(64, 32);
        bipedBody.mirror = true;
        setRotation(bipedBody, 0F, 0F, 0F);
        bipedRightArm = new ModelRenderer(this, 40, 16);
        bipedRightArm.addBox(-2F, -2F, -2F, 3, 12, 4);
        bipedRightArm.setRotationPoint(-4F, 3F, 0F);
        bipedRightArm.setTextureSize(64, 32);
        bipedRightArm.mirror = true;
        setRotation(bipedRightArm, 0F, 0F, 0F);
        bipedLeftArm = new ModelRenderer(this, 40, 16);
        bipedLeftArm.addBox(-1F, -2F, -2F, 3, 12, 4);
        bipedLeftArm.setRotationPoint(5F, 3F, 0F);
        bipedLeftArm.setTextureSize(64, 32);
        bipedLeftArm.mirror = true; //hey baby whats shakin		//bacon :D /me wants bacon mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
        setRotation(bipedLeftArm, 0F, 0F, 0F);
        bipedRightLeg = new ModelRenderer(this, 0, 16);
        bipedRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
        bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
        bipedRightLeg.setTextureSize(64, 32);
        bipedRightLeg.mirror = true;
        setRotation(bipedRightLeg, 0F, 0F, 0F);
        bipedLeftLeg = new ModelRenderer(this, 0, 16);
        bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
        bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
        bipedLeftLeg.setTextureSize(64, 32);
        bipedLeftLeg.mirror = true;
        setRotation(bipedLeftLeg, 0F, 0F, 0F);*/
        headband = new ModelRenderer(this, 24, 0);
        headband.addBox(-5F, 0F, -5F, 10, 2, 10);
        headband.setRotationPoint(0F, -7F, 0F);		//0,-7,0 before
        headband.setTextureSize(64, 32);
        headband.mirror = true;
        bipedHead.addChild(headband);
        setRotation(headband, 0F, 0F, 0F);
        armbandR = new ModelRenderer(this, 35, 5);
        armbandR.addBox(2.5F, -2F, -2.5F, 5, 1, 5);	//offset, dimensions
        armbandR.setRotationPoint(-6F, 3F, 0F);	//position
        armbandR.setTextureSize(64, 32);
        bipedRightArm.addChild(armbandR);
        setRotation(armbandR, 0F, 0F, 0F);
        armbandL = new ModelRenderer(this, 34, 0);
        armbandL.addBox(-7.5F, -2F, -2.5F, 5, 1, 5);		//offset, dimensions
        armbandL.setRotationPoint(6F, 3F, 0F);		//position
        armbandL.setTextureSize(64, 32);
        armbandL.mirror = true;
        bipedLeftArm.addChild(armbandL);
        setRotation(armbandL, 0F, 0F, 0F);
        leaf = new ModelRenderer(this, 0, 0);
        leaf.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf.setRotationPoint(2F, -6F, -6F);
        leaf.setTextureSize(64, 32);
        leaf.mirror = true;
        setRotation(leaf, 0F, 0F, 0F);
        leaf3 = new ModelRenderer(this, 0, 0);
        leaf3.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf3.setRotationPoint(-1F, -6F, -6F);
        leaf3.setTextureSize(64, 32);
        leaf3.mirror = true;
        setRotation(leaf3, 0F, 0F, 0F);
        leaf2 = new ModelRenderer(this, 0, 0);
        leaf2.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf2.setRotationPoint(-4F, -6F, -6F);
        leaf2.setTextureSize(64, 32);
        leaf2.mirror = true;
        setRotation(leaf2, 0F, 0F, 0F);
        leaf4 = new ModelRenderer(this, 0, 0);
        leaf4.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf4.setRotationPoint(0F, -7F, -6F);
        leaf4.setTextureSize(64, 32);
        leaf4.mirror = true;
        setRotation(leaf4, 0F, 0F, 0F);
        leaf5 = new ModelRenderer(this, 0, 0);
        leaf5.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf5.setRotationPoint(5F, -6F, -1F);
        leaf5.setTextureSize(64, 32);
        leaf5.mirror = true;
        setRotation(leaf5, 0F, 0F, 0F);
        leaf6 = new ModelRenderer(this, 0, 0);
        leaf6.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf6.setRotationPoint(5F, -6F, 3F);
        leaf6.setTextureSize(64, 32);
        leaf6.mirror = true;
        setRotation(leaf6, 0F, 0F, 0F);
        leaf7 = new ModelRenderer(this, 0, 0);
        leaf7.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf7.setRotationPoint(-6F, -6F, 0F);
        leaf7.setTextureSize(64, 32);
        leaf7.mirror = true;
        setRotation(leaf7, 0F, 0F, 0F);
        leaf8 = new ModelRenderer(this, 0, 0);
        leaf8.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf8.setRotationPoint(-6F, -6F, -4F);
        leaf8.setTextureSize(64, 32);
        leaf8.mirror = true;
        setRotation(leaf8, 0F, 0F, 0F);
        leaf9 = new ModelRenderer(this, 0, 0);
        leaf9.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf9.setRotationPoint(-2F, -6F, 5F);
        leaf9.setTextureSize(64, 32);
        leaf9.mirror = true;
        setRotation(leaf9, 0F, 0F, 0F);
        leaf10 = new ModelRenderer(this, 0, 0);
        leaf10.addBox(0F, 0F, 0F, 1, 0, 1);
        leaf10.setRotationPoint(2F, -6F, 5F);
        leaf10.setTextureSize(64, 32);
        leaf10.mirror = true;
        setRotation(leaf10, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        bipedHead.render(f5);
        bipedBody.render(f5);
        bipedRightArm.render(f5);
        bipedLeftArm.render(f5);
        bipedRightLeg.render(f5);
        bipedLeftLeg.render(f5);

        GlStateManager.enableCull();
        leaf.render(f5);
        leaf3.render(f5);
        leaf2.render(f5);
        leaf4.render(f5);
        leaf5.render(f5);
        leaf6.render(f5);
        leaf7.render(f5);
        leaf8.render(f5);
        leaf9.render(f5);
        leaf10.render(f5);
        GlStateManager.disableCull();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
