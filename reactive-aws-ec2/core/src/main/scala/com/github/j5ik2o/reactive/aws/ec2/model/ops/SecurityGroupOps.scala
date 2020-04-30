// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SecurityGroupBuilderOps(val self: SecurityGroup.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): SecurityGroup.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupNameAsScala(value: Option[String]): SecurityGroup.Builder = {
            value.fold(self){ v => self.groupName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipPermissionsAsScala(value: Option[Seq[IpPermission]]): SecurityGroup.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipPermissions(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerIdAsScala(value: Option[String]): SecurityGroup.Builder = {
            value.fold(self){ v => self.ownerId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdAsScala(value: Option[String]): SecurityGroup.Builder = {
            value.fold(self){ v => self.groupId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ipPermissionsEgressAsScala(value: Option[Seq[IpPermission]]): SecurityGroup.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ipPermissionsEgress(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): SecurityGroup.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala(value: Option[String]): SecurityGroup.Builder = {
            value.fold(self){ v => self.vpcId(v) }
            } 


}

final class SecurityGroupOps(val self: SecurityGroup) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupNameAsScala: Option[String] = Option(self.groupName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def ipPermissionsAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ownerIdAsScala: Option[String] = Option(self.ownerId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdAsScala: Option[String] = Option(self.groupId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def ipPermissionsEgressAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissionsEgress).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def vpcIdAsScala: Option[String] = Option(self.vpcId) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSecurityGroupOps {

implicit def toSecurityGroupBuilderOps(v: SecurityGroup.Builder): SecurityGroupBuilderOps = new SecurityGroupBuilderOps(v)

implicit def toSecurityGroupOps(v: SecurityGroup): SecurityGroupOps = new SecurityGroupOps(v)

}

