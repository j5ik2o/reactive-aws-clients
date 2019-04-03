// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateTimeToLiveResponseBuilderOps(val self: UpdateTimeToLiveResponse.Builder) extends AnyVal {

  final def withTimeToLiveSpecificationAsScala(
      value: Option[TimeToLiveSpecification]
  ): UpdateTimeToLiveResponse.Builder = {
    value.fold(self) { v =>
      self.timeToLiveSpecification(v)
    }
  } // TimeToLiveSpecification

}

final class UpdateTimeToLiveResponseOps(val self: UpdateTimeToLiveResponse) extends AnyVal {

  final def timeToLiveSpecificationAsScala: Option[TimeToLiveSpecification] =
    Option(self.timeToLiveSpecification) // TimeToLiveSpecification

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTimeToLiveResponseOps {

  implicit def toUpdateTimeToLiveResponseBuilderOps(
      v: UpdateTimeToLiveResponse.Builder
  ): UpdateTimeToLiveResponseBuilderOps = new UpdateTimeToLiveResponseBuilderOps(v)

  implicit def toUpdateTimeToLiveResponseOps(v: UpdateTimeToLiveResponse): UpdateTimeToLiveResponseOps =
    new UpdateTimeToLiveResponseOps(v)

}
