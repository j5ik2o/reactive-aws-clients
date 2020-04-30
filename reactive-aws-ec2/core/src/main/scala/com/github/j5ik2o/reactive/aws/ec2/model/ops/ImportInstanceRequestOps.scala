// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportInstanceRequestBuilderOps(val self: ImportInstanceRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala(value: Option[String]): ImportInstanceRequest.Builder = {
            value.fold(self){ v => self.description(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def diskImagesAsScala(value: Option[Seq[DiskImage]]): ImportInstanceRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.diskImages(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchSpecificationAsScala(value: Option[ImportInstanceLaunchSpecification]): ImportInstanceRequest.Builder = {
            value.fold(self){ v => self.launchSpecification(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def platformAsScala(value: Option[PlatformValues]): ImportInstanceRequest.Builder = {
            value.fold(self){ v => self.platform(v) }
            } 


}

final class ImportInstanceRequestOps(val self: ImportInstanceRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def descriptionAsScala: Option[String] = Option(self.description) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def diskImagesAsScala: Option[Seq[DiskImage]] = Option(self.diskImages).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchSpecificationAsScala: Option[ImportInstanceLaunchSpecification] = Option(self.launchSpecification) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def platformAsScala: Option[PlatformValues] = Option(self.platform) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportInstanceRequestOps {

implicit def toImportInstanceRequestBuilderOps(v: ImportInstanceRequest.Builder): ImportInstanceRequestBuilderOps = new ImportInstanceRequestBuilderOps(v)

implicit def toImportInstanceRequestOps(v: ImportInstanceRequest): ImportInstanceRequestOps = new ImportInstanceRequestOps(v)

}

