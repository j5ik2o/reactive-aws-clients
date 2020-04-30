// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaSettingsUpdateBuilderOps(val self: ReplicaSettingsUpdate.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def regionNameAsScala(value: Option[String]): ReplicaSettingsUpdate.Builder = {
            value.fold(self){ v => self.regionName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedReadCapacityUnitsAsScala(value: Option[Long]): ReplicaSettingsUpdate.Builder = {
            value.fold(self){ v => self.replicaProvisionedReadCapacityUnits(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedReadCapacityAutoScalingSettingsUpdateAsScala(value: Option[AutoScalingSettingsUpdate]): ReplicaSettingsUpdate.Builder = {
            value.fold(self){ v => self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaGlobalSecondaryIndexSettingsUpdateAsScala(value: Option[Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]]): ReplicaSettingsUpdate.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.replicaGlobalSecondaryIndexSettingsUpdate(v.asJava) } 
            }


}

final class ReplicaSettingsUpdateOps(val self: ReplicaSettingsUpdate) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def regionNameAsScala: Option[String] = Option(self.regionName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedReadCapacityUnitsAsScala: Option[Long] = Option(self.replicaProvisionedReadCapacityUnits) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaProvisionedReadCapacityAutoScalingSettingsUpdateAsScala: Option[AutoScalingSettingsUpdate] = Option(self.replicaProvisionedReadCapacityAutoScalingSettingsUpdate) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def replicaGlobalSecondaryIndexSettingsUpdateAsScala: Option[Seq[ReplicaGlobalSecondaryIndexSettingsUpdate]] = Option(self.replicaGlobalSecondaryIndexSettingsUpdate).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaSettingsUpdateOps {

implicit def toReplicaSettingsUpdateBuilderOps(v: ReplicaSettingsUpdate.Builder): ReplicaSettingsUpdateBuilderOps = new ReplicaSettingsUpdateBuilderOps(v)

implicit def toReplicaSettingsUpdateOps(v: ReplicaSettingsUpdate): ReplicaSettingsUpdateOps = new ReplicaSettingsUpdateOps(v)

}

