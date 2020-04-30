// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FleetDataBuilderOps(val self: FleetData.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def activityStatusAsScala(value: Option[FleetActivityStatus]): FleetData.Builder = {
            value.fold(self){ v => self.activityStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createTimeAsScala(value: Option[java.time.Instant]): FleetData.Builder = {
            value.fold(self){ v => self.createTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fleetIdAsScala(value: Option[String]): FleetData.Builder = {
            value.fold(self){ v => self.fleetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fleetStateAsScala(value: Option[FleetStateCode]): FleetData.Builder = {
            value.fold(self){ v => self.fleetState(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala(value: Option[String]): FleetData.Builder = {
            value.fold(self){ v => self.clientToken(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def excessCapacityTerminationPolicyAsScala(value: Option[FleetExcessCapacityTerminationPolicy]): FleetData.Builder = {
            value.fold(self){ v => self.excessCapacityTerminationPolicy(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fulfilledCapacityAsScala(value: Option[Double]): FleetData.Builder = {
            value.fold(self){ v => self.fulfilledCapacity(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fulfilledOnDemandCapacityAsScala(value: Option[Double]): FleetData.Builder = {
            value.fold(self){ v => self.fulfilledOnDemandCapacity(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def launchTemplateConfigsAsScala(value: Option[Seq[FleetLaunchTemplateConfig]]): FleetData.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.launchTemplateConfigs(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetCapacitySpecificationAsScala(value: Option[TargetCapacitySpecification]): FleetData.Builder = {
            value.fold(self){ v => self.targetCapacitySpecification(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def terminateInstancesWithExpirationAsScala(value: Option[Boolean]): FleetData.Builder = {
            value.fold(self){ v => self.terminateInstancesWithExpiration(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala(value: Option[FleetType]): FleetData.Builder = {
            value.fold(self){ v => self.`type`(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validFromAsScala(value: Option[java.time.Instant]): FleetData.Builder = {
            value.fold(self){ v => self.validFrom(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validUntilAsScala(value: Option[java.time.Instant]): FleetData.Builder = {
            value.fold(self){ v => self.validUntil(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replaceUnhealthyInstancesAsScala(value: Option[Boolean]): FleetData.Builder = {
            value.fold(self){ v => self.replaceUnhealthyInstances(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotOptionsAsScala(value: Option[SpotOptions]): FleetData.Builder = {
            value.fold(self){ v => self.spotOptions(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def onDemandOptionsAsScala(value: Option[OnDemandOptions]): FleetData.Builder = {
            value.fold(self){ v => self.onDemandOptions(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagsAsScala(value: Option[Seq[Tag]]): FleetData.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def errorsAsScala(value: Option[Seq[DescribeFleetError]]): FleetData.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.errors(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instancesAsScala(value: Option[Seq[DescribeFleetsInstances]]): FleetData.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instances(v.asJava) } 
            }


}

final class FleetDataOps(val self: FleetData) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def activityStatusAsScala: Option[FleetActivityStatus] = Option(self.activityStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fleetIdAsScala: Option[String] = Option(self.fleetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fleetStateAsScala: Option[FleetStateCode] = Option(self.fleetState) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def clientTokenAsScala: Option[String] = Option(self.clientToken) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def excessCapacityTerminationPolicyAsScala: Option[FleetExcessCapacityTerminationPolicy] = Option(self.excessCapacityTerminationPolicy) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fulfilledCapacityAsScala: Option[Double] = Option(self.fulfilledCapacity) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def fulfilledOnDemandCapacityAsScala: Option[Double] = Option(self.fulfilledOnDemandCapacity) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def launchTemplateConfigsAsScala: Option[Seq[FleetLaunchTemplateConfig]] = Option(self.launchTemplateConfigs).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def targetCapacitySpecificationAsScala: Option[TargetCapacitySpecification] = Option(self.targetCapacitySpecification) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def terminateInstancesWithExpirationAsScala: Option[Boolean] = Option(self.terminateInstancesWithExpiration) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def typeAsScala: Option[FleetType] = Option(self.`type`) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validFromAsScala: Option[java.time.Instant] = Option(self.validFrom) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def validUntilAsScala: Option[java.time.Instant] = Option(self.validUntil) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replaceUnhealthyInstancesAsScala: Option[Boolean] = Option(self.replaceUnhealthyInstances) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def spotOptionsAsScala: Option[SpotOptions] = Option(self.spotOptions) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def onDemandOptionsAsScala: Option[OnDemandOptions] = Option(self.onDemandOptions) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def errorsAsScala: Option[Seq[DescribeFleetError]] = Option(self.errors).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def instancesAsScala: Option[Seq[DescribeFleetsInstances]] = Option(self.instances).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFleetDataOps {

implicit def toFleetDataBuilderOps(v: FleetData.Builder): FleetDataBuilderOps = new FleetDataBuilderOps(v)

implicit def toFleetDataOps(v: FleetData): FleetDataOps = new FleetDataOps(v)

}

