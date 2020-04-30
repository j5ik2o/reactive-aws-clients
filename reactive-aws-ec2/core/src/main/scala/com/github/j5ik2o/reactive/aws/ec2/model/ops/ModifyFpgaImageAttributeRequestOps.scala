// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyFpgaImageAttributeRequestBuilderOps(val self: ModifyFpgaImageAttributeRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fpgaImageIdAsScala(value: Option[String]): ModifyFpgaImageAttributeRequest.Builder = {
            value.fold(self){ v => self.fpgaImageId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeAsScala(value: Option[FpgaImageAttributeName]): ModifyFpgaImageAttributeRequest.Builder = {
            value.fold(self){ v => self.attribute(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationTypeAsScala(value: Option[OperationType]): ModifyFpgaImageAttributeRequest.Builder = {
            value.fold(self){ v => self.operationType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userIdsAsScala(value: Option[Seq[String]]): ModifyFpgaImageAttributeRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.userIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userGroupsAsScala(value: Option[Seq[String]]): ModifyFpgaImageAttributeRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.userGroups(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def productCodesAsScala(value: Option[Seq[String]]): ModifyFpgaImageAttributeRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def loadPermissionAsScala(value: Option[LoadPermissionModifications]): ModifyFpgaImageAttributeRequest.Builder = {
            value.fold(self){ v => self.loadPermission(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): ModifyFpgaImageAttributeRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala(value: Option[String]): ModifyFpgaImageAttributeRequest.Builder = {
            value.fold(self){ v => self.name(v) }
            } 


}

final class ModifyFpgaImageAttributeRequestOps(val self: ModifyFpgaImageAttributeRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeAsScala: Option[FpgaImageAttributeName] = Option(self.attribute) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationTypeAsScala: Option[OperationType] = Option(self.operationType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def userIdsAsScala: Option[Seq[String]] = Option(self.userIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def userGroupsAsScala: Option[Seq[String]] = Option(self.userGroups).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def productCodesAsScala: Option[Seq[String]] = Option(self.productCodes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def loadPermissionAsScala: Option[LoadPermissionModifications] = Option(self.loadPermission) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala: Option[String] = Option(self.name) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyFpgaImageAttributeRequestOps {

implicit def toModifyFpgaImageAttributeRequestBuilderOps(v: ModifyFpgaImageAttributeRequest.Builder): ModifyFpgaImageAttributeRequestBuilderOps = new ModifyFpgaImageAttributeRequestBuilderOps(v)

implicit def toModifyFpgaImageAttributeRequestOps(v: ModifyFpgaImageAttributeRequest): ModifyFpgaImageAttributeRequestOps = new ModifyFpgaImageAttributeRequestOps(v)

}

