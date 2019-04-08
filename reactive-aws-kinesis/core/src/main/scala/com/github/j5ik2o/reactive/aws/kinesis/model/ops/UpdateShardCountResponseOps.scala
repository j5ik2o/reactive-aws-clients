// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class UpdateShardCountResponseBuilderOps(val self: UpdateShardCountResponse.Builder) extends AnyVal {

  final def streamNameAsScala(value: Option[String]): UpdateShardCountResponse.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def currentShardCountAsScala(value: Option[Int]): UpdateShardCountResponse.Builder = {
    value.fold(self) { v =>
      self.currentShardCount(v)
    }
  } // Int

  final def targetShardCountAsScala(value: Option[Int]): UpdateShardCountResponse.Builder = {
    value.fold(self) { v =>
      self.targetShardCount(v)
    }
  } // Int

}

final class UpdateShardCountResponseOps(val self: UpdateShardCountResponse) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def currentShardCountAsScala: Option[Int] = Option(self.currentShardCount) // Int

  final def targetShardCountAsScala: Option[Int] = Option(self.targetShardCount) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateShardCountResponseOps {

  implicit def toUpdateShardCountResponseBuilderOps(
      v: UpdateShardCountResponse.Builder
  ): UpdateShardCountResponseBuilderOps = new UpdateShardCountResponseBuilderOps(v)

  implicit def toUpdateShardCountResponseOps(v: UpdateShardCountResponse): UpdateShardCountResponseOps =
    new UpdateShardCountResponseOps(v)

}
