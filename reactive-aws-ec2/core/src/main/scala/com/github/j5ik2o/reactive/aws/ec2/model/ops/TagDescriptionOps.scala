// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TagDescriptionBuilderOps(val self: TagDescription.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala(value: Option[String]): TagDescription.Builder = {
            value.fold(self){ v => self.key(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceIdAsScala(value: Option[String]): TagDescription.Builder = {
            value.fold(self){ v => self.resourceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceTypeAsScala(value: Option[ResourceType]): TagDescription.Builder = {
            value.fold(self){ v => self.resourceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala(value: Option[String]): TagDescription.Builder = {
            value.fold(self){ v => self.value(v) }
            } 


}

final class TagDescriptionOps(val self: TagDescription) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala: Option[String] = Option(self.key) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceIdAsScala: Option[String] = Option(self.resourceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def resourceTypeAsScala: Option[ResourceType] = Option(self.resourceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def valueAsScala: Option[String] = Option(self.value) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagDescriptionOps {

implicit def toTagDescriptionBuilderOps(v: TagDescription.Builder): TagDescriptionBuilderOps = new TagDescriptionBuilderOps(v)

implicit def toTagDescriptionOps(v: TagDescription): TagDescriptionOps = new TagDescriptionOps(v)

}

