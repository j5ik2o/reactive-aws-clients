// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaSettingsDescriptionBuilderOps(val self: ReplicaSettingsDescription.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def regionNameAsScala(value: Option[String]): ReplicaSettingsDescription.Builder = {
            value.fold(self){ v => self.regionName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaStatusAsScala(value: Option[ReplicaStatus]): ReplicaSettingsDescription.Builder = {
            value.fold(self){ v => self.replicaStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaBillingModeSummaryAsScala(value: Option[BillingModeSummary]): ReplicaSettingsDescription.Builder = {
            value.fold(self){ v => self.replicaBillingModeSummary(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedReadCapacityUnitsAsScala(value: Option[Long]): ReplicaSettingsDescription.Builder = {
            value.fold(self){ v => self.replicaProvisionedReadCapacityUnits(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedReadCapacityAutoScalingSettingsAsScala(value: Option[AutoScalingSettingsDescription]): ReplicaSettingsDescription.Builder = {
            value.fold(self){ v => self.replicaProvisionedReadCapacityAutoScalingSettings(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedWriteCapacityUnitsAsScala(value: Option[Long]): ReplicaSettingsDescription.Builder = {
            value.fold(self){ v => self.replicaProvisionedWriteCapacityUnits(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedWriteCapacityAutoScalingSettingsAsScala(value: Option[AutoScalingSettingsDescription]): ReplicaSettingsDescription.Builder = {
            value.fold(self){ v => self.replicaProvisionedWriteCapacityAutoScalingSettings(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaGlobalSecondaryIndexSettingsAsScala(value: Option[Seq[ReplicaGlobalSecondaryIndexSettingsDescription]]): ReplicaSettingsDescription.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.replicaGlobalSecondaryIndexSettings(v.asJava) } 
            }


}

final class ReplicaSettingsDescriptionOps(val self: ReplicaSettingsDescription) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def regionNameAsScala: Option[String] = Option(self.regionName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaStatusAsScala: Option[ReplicaStatus] = Option(self.replicaStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaBillingModeSummaryAsScala: Option[BillingModeSummary] = Option(self.replicaBillingModeSummary) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedReadCapacityUnitsAsScala: Option[Long] = Option(self.replicaProvisionedReadCapacityUnits) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedReadCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] = Option(self.replicaProvisionedReadCapacityAutoScalingSettings) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedWriteCapacityUnitsAsScala: Option[Long] = Option(self.replicaProvisionedWriteCapacityUnits) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedWriteCapacityAutoScalingSettingsAsScala: Option[AutoScalingSettingsDescription] = Option(self.replicaProvisionedWriteCapacityAutoScalingSettings) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def replicaGlobalSecondaryIndexSettingsAsScala: Option[Seq[ReplicaGlobalSecondaryIndexSettingsDescription]] = Option(self.replicaGlobalSecondaryIndexSettings).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaSettingsDescriptionOps {

implicit def toReplicaSettingsDescriptionBuilderOps(v: ReplicaSettingsDescription.Builder): ReplicaSettingsDescriptionBuilderOps = new ReplicaSettingsDescriptionBuilderOps(v)

implicit def toReplicaSettingsDescriptionOps(v: ReplicaSettingsDescription): ReplicaSettingsDescriptionOps = new ReplicaSettingsDescriptionOps(v)

}

