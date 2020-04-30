// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLaunchTemplateVersionsResponseBuilderOps(val self: DeleteLaunchTemplateVersionsResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def successfullyDeletedLaunchTemplateVersionsAsScala(value: Option[Seq[DeleteLaunchTemplateVersionsResponseSuccessItem]]): DeleteLaunchTemplateVersionsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.successfullyDeletedLaunchTemplateVersions(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def unsuccessfullyDeletedLaunchTemplateVersionsAsScala(value: Option[Seq[DeleteLaunchTemplateVersionsResponseErrorItem]]): DeleteLaunchTemplateVersionsResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.unsuccessfullyDeletedLaunchTemplateVersions(v.asJava) } 
            }


}

final class DeleteLaunchTemplateVersionsResponseOps(val self: DeleteLaunchTemplateVersionsResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def successfullyDeletedLaunchTemplateVersionsAsScala: Option[Seq[DeleteLaunchTemplateVersionsResponseSuccessItem]] = Option(self.successfullyDeletedLaunchTemplateVersions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def unsuccessfullyDeletedLaunchTemplateVersionsAsScala: Option[Seq[DeleteLaunchTemplateVersionsResponseErrorItem]] = Option(self.unsuccessfullyDeletedLaunchTemplateVersions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLaunchTemplateVersionsResponseOps {

implicit def toDeleteLaunchTemplateVersionsResponseBuilderOps(v: DeleteLaunchTemplateVersionsResponse.Builder): DeleteLaunchTemplateVersionsResponseBuilderOps = new DeleteLaunchTemplateVersionsResponseBuilderOps(v)

implicit def toDeleteLaunchTemplateVersionsResponseOps(v: DeleteLaunchTemplateVersionsResponse): DeleteLaunchTemplateVersionsResponseOps = new DeleteLaunchTemplateVersionsResponseOps(v)

}

