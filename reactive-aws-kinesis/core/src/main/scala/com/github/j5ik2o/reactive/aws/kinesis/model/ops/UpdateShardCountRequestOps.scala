// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class UpdateShardCountRequestBuilderOps(val self: UpdateShardCountRequest.Builder) extends AnyVal {

  final def withStreamNameAsScala(value: Option[String]): UpdateShardCountRequest.Builder = {
    value.fold(self) { v =>
      self.streamName(v)
    }
  } // String

  final def withTargetShardCountAsScala(value: Option[Int]): UpdateShardCountRequest.Builder = {
    value.fold(self) { v =>
      self.targetShardCount(v)
    }
  } // Int

  final def withScalingTypeAsScala(value: Option[ScalingType]): UpdateShardCountRequest.Builder = {
    value.fold(self) { v =>
      self.scalingType(v)
    }
  } // String

}

final class UpdateShardCountRequestOps(val self: UpdateShardCountRequest) extends AnyVal {

  final def streamNameAsScala: Option[String] = Option(self.streamName) // String

  final def targetShardCountAsScala: Option[Int] = Option(self.targetShardCount) // Int

  final def scalingTypeAsScala: Option[ScalingType] = Option(self.scalingType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateShardCountRequestOps {

  implicit def toUpdateShardCountRequestBuilderOps(
      v: UpdateShardCountRequest.Builder
  ): UpdateShardCountRequestBuilderOps = new UpdateShardCountRequestBuilderOps(v)

  implicit def toUpdateShardCountRequestOps(v: UpdateShardCountRequest): UpdateShardCountRequestOps =
    new UpdateShardCountRequestOps(v)

}
