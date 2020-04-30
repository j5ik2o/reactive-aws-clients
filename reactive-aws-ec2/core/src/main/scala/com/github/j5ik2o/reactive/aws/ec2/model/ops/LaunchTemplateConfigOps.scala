// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateConfigBuilderOps(val self: LaunchTemplateConfig.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTemplateSpecificationAsScala(value: Option[FleetLaunchTemplateSpecification]): LaunchTemplateConfig.Builder = {
            value.fold(self){ v => self.launchTemplateSpecification(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def overridesAsScala(value: Option[Seq[LaunchTemplateOverrides]]): LaunchTemplateConfig.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.overrides(v.asJava) } 
            }


}

final class LaunchTemplateConfigOps(val self: LaunchTemplateConfig) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTemplateSpecificationAsScala: Option[FleetLaunchTemplateSpecification] = Option(self.launchTemplateSpecification) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def overridesAsScala: Option[Seq[LaunchTemplateOverrides]] = Option(self.overrides).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateConfigOps {

implicit def toLaunchTemplateConfigBuilderOps(v: LaunchTemplateConfig.Builder): LaunchTemplateConfigBuilderOps = new LaunchTemplateConfigBuilderOps(v)

implicit def toLaunchTemplateConfigOps(v: LaunchTemplateConfig): LaunchTemplateConfigOps = new LaunchTemplateConfigOps(v)

}

