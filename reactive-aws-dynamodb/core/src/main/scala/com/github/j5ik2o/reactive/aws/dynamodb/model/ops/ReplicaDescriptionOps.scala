// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaDescriptionBuilderOps(val self: ReplicaDescription.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def regionNameAsScala(value: Option[String]): ReplicaDescription.Builder = {
            value.fold(self){ v => self.regionName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaStatusAsScala(value: Option[ReplicaStatus]): ReplicaDescription.Builder = {
            value.fold(self){ v => self.replicaStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaStatusDescriptionAsScala(value: Option[String]): ReplicaDescription.Builder = {
            value.fold(self){ v => self.replicaStatusDescription(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaStatusPercentProgressAsScala(value: Option[String]): ReplicaDescription.Builder = {
            value.fold(self){ v => self.replicaStatusPercentProgress(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsMasterKeyIdAsScala(value: Option[String]): ReplicaDescription.Builder = {
            value.fold(self){ v => self.kmsMasterKeyId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputOverrideAsScala(value: Option[ProvisionedThroughputOverride]): ReplicaDescription.Builder = {
            value.fold(self){ v => self.provisionedThroughputOverride(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def globalSecondaryIndexesAsScala(value: Option[Seq[ReplicaGlobalSecondaryIndexDescription]]): ReplicaDescription.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexes(v.asJava) } 
            }


}

final class ReplicaDescriptionOps(val self: ReplicaDescription) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def regionNameAsScala: Option[String] = Option(self.regionName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaStatusAsScala: Option[ReplicaStatus] = Option(self.replicaStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaStatusDescriptionAsScala: Option[String] = Option(self.replicaStatusDescription) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaStatusPercentProgressAsScala: Option[String] = Option(self.replicaStatusPercentProgress) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def kmsMasterKeyIdAsScala: Option[String] = Option(self.kmsMasterKeyId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputOverrideAsScala: Option[ProvisionedThroughputOverride] = Option(self.provisionedThroughputOverride) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def globalSecondaryIndexesAsScala: Option[Seq[ReplicaGlobalSecondaryIndexDescription]] = Option(self.globalSecondaryIndexes).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaDescriptionOps {

implicit def toReplicaDescriptionBuilderOps(v: ReplicaDescription.Builder): ReplicaDescriptionBuilderOps = new ReplicaDescriptionBuilderOps(v)

implicit def toReplicaDescriptionOps(v: ReplicaDescription): ReplicaDescriptionOps = new ReplicaDescriptionOps(v)

}

