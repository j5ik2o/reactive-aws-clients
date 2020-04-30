// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportInstanceLaunchSpecificationBuilderOps(val self: ImportInstanceLaunchSpecification.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def additionalInfoAsScala(value: Option[String]): ImportInstanceLaunchSpecification.Builder = {
            value.fold(self){ v => self.additionalInfo(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def architectureAsScala(value: Option[ArchitectureValues]): ImportInstanceLaunchSpecification.Builder = {
            value.fold(self){ v => self.architecture(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupIdsAsScala(value: Option[Seq[String]]): ImportInstanceLaunchSpecification.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groupIds(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def groupNamesAsScala(value: Option[Seq[String]]): ImportInstanceLaunchSpecification.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groupNames(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceInitiatedShutdownBehaviorAsScala(value: Option[ShutdownBehavior]): ImportInstanceLaunchSpecification.Builder = {
            value.fold(self){ v => self.instanceInitiatedShutdownBehavior(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala(value: Option[InstanceType]): ImportInstanceLaunchSpecification.Builder = {
            value.fold(self){ v => self.instanceType(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def monitoringAsScala(value: Option[Boolean]): ImportInstanceLaunchSpecification.Builder = {
            value.fold(self){ v => self.monitoring(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def placementAsScala(value: Option[Placement]): ImportInstanceLaunchSpecification.Builder = {
            value.fold(self){ v => self.placement(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateIpAddressAsScala(value: Option[String]): ImportInstanceLaunchSpecification.Builder = {
            value.fold(self){ v => self.privateIpAddress(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala(value: Option[String]): ImportInstanceLaunchSpecification.Builder = {
            value.fold(self){ v => self.subnetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userDataAsScala(value: Option[UserData]): ImportInstanceLaunchSpecification.Builder = {
            value.fold(self){ v => self.userData(v) }
            } 


}

final class ImportInstanceLaunchSpecificationOps(val self: ImportInstanceLaunchSpecification) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def additionalInfoAsScala: Option[String] = Option(self.additionalInfo) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def architectureAsScala: Option[ArchitectureValues] = Option(self.architecture) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def groupIdsAsScala: Option[Seq[String]] = Option(self.groupIds).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def groupNamesAsScala: Option[Seq[String]] = Option(self.groupNames).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceInitiatedShutdownBehaviorAsScala: Option[ShutdownBehavior] = Option(self.instanceInitiatedShutdownBehavior) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceTypeAsScala: Option[InstanceType] = Option(self.instanceType) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def monitoringAsScala: Option[Boolean] = Option(self.monitoring) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def placementAsScala: Option[Placement] = Option(self.placement) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def subnetIdAsScala: Option[String] = Option(self.subnetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def userDataAsScala: Option[UserData] = Option(self.userData) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportInstanceLaunchSpecificationOps {

implicit def toImportInstanceLaunchSpecificationBuilderOps(v: ImportInstanceLaunchSpecification.Builder): ImportInstanceLaunchSpecificationBuilderOps = new ImportInstanceLaunchSpecificationBuilderOps(v)

implicit def toImportInstanceLaunchSpecificationOps(v: ImportInstanceLaunchSpecification): ImportInstanceLaunchSpecificationOps = new ImportInstanceLaunchSpecificationOps(v)

}

