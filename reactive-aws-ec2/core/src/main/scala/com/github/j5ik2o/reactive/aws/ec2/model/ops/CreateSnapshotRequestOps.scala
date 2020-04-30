// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSnapshotRequestBuilderOps(val self: CreateSnapshotRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): CreateSnapshotRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeIdAsScala(value: Option[String]): CreateSnapshotRequest.Builder = {
            value.fold(self){ v => self.volumeId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateSnapshotRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava) } 
            }


}

final class CreateSnapshotRequestOps(val self: CreateSnapshotRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def volumeIdAsScala: Option[String] = Option(self.volumeId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSnapshotRequestOps {

implicit def toCreateSnapshotRequestBuilderOps(v: CreateSnapshotRequest.Builder): CreateSnapshotRequestBuilderOps = new CreateSnapshotRequestBuilderOps(v)

implicit def toCreateSnapshotRequestOps(v: CreateSnapshotRequest): CreateSnapshotRequestOps = new CreateSnapshotRequestOps(v)

}

