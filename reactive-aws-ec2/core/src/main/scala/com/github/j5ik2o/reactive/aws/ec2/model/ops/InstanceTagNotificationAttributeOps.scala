// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceTagNotificationAttributeBuilderOps(val self: InstanceTagNotificationAttribute.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTagKeysAsScala(value: Option[Seq[String]]): InstanceTagNotificationAttribute.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceTagKeys(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def includeAllTagsOfInstanceAsScala(value: Option[Boolean]): InstanceTagNotificationAttribute.Builder = {
            value.fold(self){ v => self.includeAllTagsOfInstance(v) }
            } 


}

final class InstanceTagNotificationAttributeOps(val self: InstanceTagNotificationAttribute) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def instanceTagKeysAsScala: Option[Seq[String]] = Option(self.instanceTagKeys).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def includeAllTagsOfInstanceAsScala: Option[Boolean] = Option(self.includeAllTagsOfInstance) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceTagNotificationAttributeOps {

implicit def toInstanceTagNotificationAttributeBuilderOps(v: InstanceTagNotificationAttribute.Builder): InstanceTagNotificationAttributeBuilderOps = new InstanceTagNotificationAttributeBuilderOps(v)

implicit def toInstanceTagNotificationAttributeOps(v: InstanceTagNotificationAttribute): InstanceTagNotificationAttributeOps = new InstanceTagNotificationAttributeOps(v)

}

