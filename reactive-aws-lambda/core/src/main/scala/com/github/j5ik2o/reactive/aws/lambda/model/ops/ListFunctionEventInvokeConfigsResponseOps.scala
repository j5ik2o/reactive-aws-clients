// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListFunctionEventInvokeConfigsResponseBuilderOps(val self: ListFunctionEventInvokeConfigsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionEventInvokeConfigsAsScala(
      value: Option[Seq[FunctionEventInvokeConfig]]
  ): ListFunctionEventInvokeConfigsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.functionEventInvokeConfigs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListFunctionEventInvokeConfigsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

}

final class ListFunctionEventInvokeConfigsResponseOps(val self: ListFunctionEventInvokeConfigsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionEventInvokeConfigsAsScala: Option[Seq[FunctionEventInvokeConfig]] =
    Option(self.functionEventInvokeConfigs).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionEventInvokeConfigsResponseOps {

  implicit def toListFunctionEventInvokeConfigsResponseBuilderOps(
      v: ListFunctionEventInvokeConfigsResponse.Builder
  ): ListFunctionEventInvokeConfigsResponseBuilderOps = new ListFunctionEventInvokeConfigsResponseBuilderOps(v)

  implicit def toListFunctionEventInvokeConfigsResponseOps(
      v: ListFunctionEventInvokeConfigsResponse
  ): ListFunctionEventInvokeConfigsResponseOps = new ListFunctionEventInvokeConfigsResponseOps(v)

}
