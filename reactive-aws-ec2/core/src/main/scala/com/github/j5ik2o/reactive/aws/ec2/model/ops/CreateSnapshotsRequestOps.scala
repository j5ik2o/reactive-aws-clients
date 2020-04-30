// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSnapshotsRequestBuilderOps(val self: CreateSnapshotsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): CreateSnapshotsRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceSpecificationAsScala(value: Option[InstanceSpecification]): CreateSnapshotsRequest.Builder = {
            value.fold(self){ v => self.instanceSpecification(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateSnapshotsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def copyTagsFromSourceAsScala(value: Option[CopyTagsFromSource]): CreateSnapshotsRequest.Builder = {
            value.fold(self){ v => self.copyTagsFromSource(v) }
            } 


}

final class CreateSnapshotsRequestOps(val self: CreateSnapshotsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceSpecificationAsScala: Option[InstanceSpecification] = Option(self.instanceSpecification) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def copyTagsFromSourceAsScala: Option[CopyTagsFromSource] = Option(self.copyTagsFromSource) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSnapshotsRequestOps {

implicit def toCreateSnapshotsRequestBuilderOps(v: CreateSnapshotsRequest.Builder): CreateSnapshotsRequestBuilderOps = new CreateSnapshotsRequestBuilderOps(v)

implicit def toCreateSnapshotsRequestOps(v: CreateSnapshotsRequest): CreateSnapshotsRequestOps = new CreateSnapshotsRequestOps(v)

}

