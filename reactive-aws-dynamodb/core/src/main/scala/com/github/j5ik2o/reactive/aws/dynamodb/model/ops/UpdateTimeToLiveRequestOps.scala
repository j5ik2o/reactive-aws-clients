// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateTimeToLiveRequestBuilderOps(val self: UpdateTimeToLiveRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): UpdateTimeToLiveRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  } // String

  final def timeToLiveSpecificationAsScala(value: Option[TimeToLiveSpecification]): UpdateTimeToLiveRequest.Builder = {
    value.fold(self) { v =>
      self.timeToLiveSpecification(v)
    }
  } // TimeToLiveSpecification

}

final class UpdateTimeToLiveRequestOps(val self: UpdateTimeToLiveRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName) // String

  final def timeToLiveSpecificationAsScala: Option[TimeToLiveSpecification] =
    Option(self.timeToLiveSpecification) // TimeToLiveSpecification

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTimeToLiveRequestOps {

  implicit def toUpdateTimeToLiveRequestBuilderOps(
      v: UpdateTimeToLiveRequest.Builder
  ): UpdateTimeToLiveRequestBuilderOps = new UpdateTimeToLiveRequestBuilderOps(v)

  implicit def toUpdateTimeToLiveRequestOps(v: UpdateTimeToLiveRequest): UpdateTimeToLiveRequestOps =
    new UpdateTimeToLiveRequestOps(v)

}
