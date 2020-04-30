// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaGlobalSecondaryIndexDescriptionBuilderOps(val self: ReplicaGlobalSecondaryIndexDescription.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def indexNameAsScala(value: Option[String]): ReplicaGlobalSecondaryIndexDescription.Builder = {
            value.fold(self){ v => self.indexName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputOverrideAsScala(value: Option[ProvisionedThroughputOverride]): ReplicaGlobalSecondaryIndexDescription.Builder = {
            value.fold(self){ v => self.provisionedThroughputOverride(v) }
            } 


}

final class ReplicaGlobalSecondaryIndexDescriptionOps(val self: ReplicaGlobalSecondaryIndexDescription) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def indexNameAsScala: Option[String] = Option(self.indexName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputOverrideAsScala: Option[ProvisionedThroughputOverride] = Option(self.provisionedThroughputOverride) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaGlobalSecondaryIndexDescriptionOps {

implicit def toReplicaGlobalSecondaryIndexDescriptionBuilderOps(v: ReplicaGlobalSecondaryIndexDescription.Builder): ReplicaGlobalSecondaryIndexDescriptionBuilderOps = new ReplicaGlobalSecondaryIndexDescriptionBuilderOps(v)

implicit def toReplicaGlobalSecondaryIndexDescriptionOps(v: ReplicaGlobalSecondaryIndexDescription): ReplicaGlobalSecondaryIndexDescriptionOps = new ReplicaGlobalSecondaryIndexDescriptionOps(v)

}

