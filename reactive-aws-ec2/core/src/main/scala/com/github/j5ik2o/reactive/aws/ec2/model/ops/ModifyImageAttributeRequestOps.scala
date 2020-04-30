// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyImageAttributeRequestBuilderOps(val self: ModifyImageAttributeRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeAsScala(value: Option[String]): ModifyImageAttributeRequest.Builder = {
            value.fold(self){ v => self.attribute(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[AttributeValue]): ModifyImageAttributeRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala(value: Option[String]): ModifyImageAttributeRequest.Builder = {
            value.fold(self){ v => self.imageId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchPermissionAsScala(value: Option[LaunchPermissionModifications]): ModifyImageAttributeRequest.Builder = {
            value.fold(self){ v => self.launchPermission(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationTypeAsScala(value: Option[OperationType]): ModifyImageAttributeRequest.Builder = {
            value.fold(self){ v => self.operationType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def productCodesAsScala(value: Option[Seq[String]]): ModifyImageAttributeRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.productCodes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userGroupsAsScala(value: Option[Seq[String]]): ModifyImageAttributeRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.userGroups(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userIdsAsScala(value: Option[Seq[String]]): ModifyImageAttributeRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.userIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala(value: Option[String]): ModifyImageAttributeRequest.Builder = {
            value.fold(self){ v => self.value(v) }
            } 


}

final class ModifyImageAttributeRequestOps(val self: ModifyImageAttributeRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeAsScala: Option[String] = Option(self.attribute) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[AttributeValue] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def imageIdAsScala: Option[String] = Option(self.imageId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchPermissionAsScala: Option[LaunchPermissionModifications] = Option(self.launchPermission) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def operationTypeAsScala: Option[OperationType] = Option(self.operationType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def productCodesAsScala: Option[Seq[String]] = Option(self.productCodes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def userGroupsAsScala: Option[Seq[String]] = Option(self.userGroups).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def userIdsAsScala: Option[Seq[String]] = Option(self.userIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala: Option[String] = Option(self.value) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyImageAttributeRequestOps {

implicit def toModifyImageAttributeRequestBuilderOps(v: ModifyImageAttributeRequest.Builder): ModifyImageAttributeRequestBuilderOps = new ModifyImageAttributeRequestBuilderOps(v)

implicit def toModifyImageAttributeRequestOps(v: ModifyImageAttributeRequest): ModifyImageAttributeRequestOps = new ModifyImageAttributeRequestOps(v)

}

