// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class StreamSpecificationBuilderOps(val self: StreamSpecification.Builder) extends AnyVal {

  final def withStreamEnabledAsScala(value: Option[Boolean]): StreamSpecification.Builder = {
    value.fold(self) { v =>
      self.streamEnabled(v)
    }
  } // Boolean

  final def withStreamViewTypeAsScala(value: Option[StreamViewType]): StreamSpecification.Builder = {
    value.fold(self) { v =>
      self.streamViewType(v)
    }
  } // String

}

final class StreamSpecificationOps(val self: StreamSpecification) extends AnyVal {

  final def streamEnabledAsScala: Option[Boolean] = Option(self.streamEnabled) // Boolean

  final def streamViewTypeAsScala: Option[StreamViewType] = Option(self.streamViewType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStreamSpecificationOps {

  implicit def toStreamSpecificationBuilderOps(v: StreamSpecification.Builder): StreamSpecificationBuilderOps =
    new StreamSpecificationBuilderOps(v)

  implicit def toStreamSpecificationOps(v: StreamSpecification): StreamSpecificationOps = new StreamSpecificationOps(v)

}
