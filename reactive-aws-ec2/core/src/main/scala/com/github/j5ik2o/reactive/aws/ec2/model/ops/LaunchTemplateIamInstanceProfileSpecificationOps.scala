// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateIamInstanceProfileSpecificationBuilderOps(val self: LaunchTemplateIamInstanceProfileSpecification.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def arnAsScala(value: Option[String]): LaunchTemplateIamInstanceProfileSpecification.Builder = {
            value.fold(self){ v => self.arn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala(value: Option[String]): LaunchTemplateIamInstanceProfileSpecification.Builder = {
            value.fold(self){ v => self.name(v) }
            } 


}

final class LaunchTemplateIamInstanceProfileSpecificationOps(val self: LaunchTemplateIamInstanceProfileSpecification) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def arnAsScala: Option[String] = Option(self.arn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def nameAsScala: Option[String] = Option(self.name) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateIamInstanceProfileSpecificationOps {

implicit def toLaunchTemplateIamInstanceProfileSpecificationBuilderOps(v: LaunchTemplateIamInstanceProfileSpecification.Builder): LaunchTemplateIamInstanceProfileSpecificationBuilderOps = new LaunchTemplateIamInstanceProfileSpecificationBuilderOps(v)

implicit def toLaunchTemplateIamInstanceProfileSpecificationOps(v: LaunchTemplateIamInstanceProfileSpecification): LaunchTemplateIamInstanceProfileSpecificationOps = new LaunchTemplateIamInstanceProfileSpecificationOps(v)

}

