// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaUpdateBuilderOps(val self: ReplicaUpdate.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createAsScala(value: Option[CreateReplicaAction]): ReplicaUpdate.Builder = {
            value.fold(self){ v => self.create(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deleteAsScala(value: Option[DeleteReplicaAction]): ReplicaUpdate.Builder = {
            value.fold(self){ v => self.delete(v) }
            } 


}

final class ReplicaUpdateOps(val self: ReplicaUpdate) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def createAsScala: Option[CreateReplicaAction] = Option(self.create) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def deleteAsScala: Option[DeleteReplicaAction] = Option(self.delete) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaUpdateOps {

implicit def toReplicaUpdateBuilderOps(v: ReplicaUpdate.Builder): ReplicaUpdateBuilderOps = new ReplicaUpdateBuilderOps(v)

implicit def toReplicaUpdateOps(v: ReplicaUpdate): ReplicaUpdateOps = new ReplicaUpdateOps(v)

}

