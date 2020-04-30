// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ContainerInstanceBuilderOps(val self: ContainerInstance.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def containerInstanceArnAsScala(value: Option[String]): ContainerInstance.Builder = {
            value.fold(self){ v => self.containerInstanceArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ec2InstanceIdAsScala(value: Option[String]): ContainerInstance.Builder = {
            value.fold(self){ v => self.ec2InstanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityProviderNameAsScala(value: Option[String]): ContainerInstance.Builder = {
            value.fold(self){ v => self.capacityProviderName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionAsScala(value: Option[Long]): ContainerInstance.Builder = {
            value.fold(self){ v => self.version(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionInfoAsScala(value: Option[VersionInfo]): ContainerInstance.Builder = {
            value.fold(self){ v => self.versionInfo(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def remainingResourcesAsScala(value: Option[Seq[Resource]]): ContainerInstance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.remainingResources(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def registeredResourcesAsScala(value: Option[Seq[Resource]]): ContainerInstance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.registeredResources(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[String]): ContainerInstance.Builder = {
            value.fold(self){ v => self.status(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusReasonAsScala(value: Option[String]): ContainerInstance.Builder = {
            value.fold(self){ v => self.statusReason(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def agentConnectedAsScala(value: Option[Boolean]): ContainerInstance.Builder = {
            value.fold(self){ v => self.agentConnected(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def runningTasksCountAsScala(value: Option[Int]): ContainerInstance.Builder = {
            value.fold(self){ v => self.runningTasksCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def pendingTasksCountAsScala(value: Option[Int]): ContainerInstance.Builder = {
            value.fold(self){ v => self.pendingTasksCount(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def agentUpdateStatusAsScala(value: Option[AgentUpdateStatus]): ContainerInstance.Builder = {
            value.fold(self){ v => self.agentUpdateStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributesAsScala(value: Option[Seq[Attribute]]): ContainerInstance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def registeredAtAsScala(value: Option[java.time.Instant]): ContainerInstance.Builder = {
            value.fold(self){ v => self.registeredAt(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attachmentsAsScala(value: Option[Seq[Attachment]]): ContainerInstance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attachments(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): ContainerInstance.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }


}

final class ContainerInstanceOps(val self: ContainerInstance) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def ec2InstanceIdAsScala: Option[String] = Option(self.ec2InstanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def capacityProviderNameAsScala: Option[String] = Option(self.capacityProviderName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionAsScala: Option[Long] = Option(self.version) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionInfoAsScala: Option[VersionInfo] = Option(self.versionInfo) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def remainingResourcesAsScala: Option[Seq[Resource]] = Option(self.remainingResources).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def registeredResourcesAsScala: Option[Seq[Resource]] = Option(self.registeredResources).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[String] = Option(self.status) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusReasonAsScala: Option[String] = Option(self.statusReason) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def agentConnectedAsScala: Option[Boolean] = Option(self.agentConnected) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def runningTasksCountAsScala: Option[Int] = Option(self.runningTasksCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def pendingTasksCountAsScala: Option[Int] = Option(self.pendingTasksCount) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def agentUpdateStatusAsScala: Option[AgentUpdateStatus] = Option(self.agentUpdateStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def attributesAsScala: Option[Seq[Attribute]] = Option(self.attributes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def registeredAtAsScala: Option[java.time.Instant] = Option(self.registeredAt) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def attachmentsAsScala: Option[Seq[Attachment]] = Option(self.attachments).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerInstanceOps {

implicit def toContainerInstanceBuilderOps(v: ContainerInstance.Builder): ContainerInstanceBuilderOps = new ContainerInstanceBuilderOps(v)

implicit def toContainerInstanceOps(v: ContainerInstance): ContainerInstanceOps = new ContainerInstanceOps(v)

}

