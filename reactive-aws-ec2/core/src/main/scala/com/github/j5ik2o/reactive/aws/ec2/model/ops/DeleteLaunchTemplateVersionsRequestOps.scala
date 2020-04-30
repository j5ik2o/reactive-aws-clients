// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLaunchTemplateVersionsRequestBuilderOps(val self: DeleteLaunchTemplateVersionsRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTemplateIdAsScala(value: Option[String]): DeleteLaunchTemplateVersionsRequest.Builder = {
            value.fold(self){ v => self.launchTemplateId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTemplateNameAsScala(value: Option[String]): DeleteLaunchTemplateVersionsRequest.Builder = {
            value.fold(self){ v => self.launchTemplateName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def versionsAsScala(value: Option[Seq[String]]): DeleteLaunchTemplateVersionsRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.versions(v.asJava) } 
            }


}

final class DeleteLaunchTemplateVersionsRequestOps(val self: DeleteLaunchTemplateVersionsRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def versionsAsScala: Option[Seq[String]] = Option(self.versions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLaunchTemplateVersionsRequestOps {

implicit def toDeleteLaunchTemplateVersionsRequestBuilderOps(v: DeleteLaunchTemplateVersionsRequest.Builder): DeleteLaunchTemplateVersionsRequestBuilderOps = new DeleteLaunchTemplateVersionsRequestBuilderOps(v)

implicit def toDeleteLaunchTemplateVersionsRequestOps(v: DeleteLaunchTemplateVersionsRequest): DeleteLaunchTemplateVersionsRequestOps = new DeleteLaunchTemplateVersionsRequestOps(v)

}

