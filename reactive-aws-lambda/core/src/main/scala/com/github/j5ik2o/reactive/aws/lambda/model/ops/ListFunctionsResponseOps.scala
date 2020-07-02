// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListFunctionsResponseBuilderOps(val self: ListFunctionsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListFunctionsResponse.Builder = {
    value.fold(self) { v => self.nextMarker(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionsAsScala(value: Option[Seq[FunctionConfiguration]]): ListFunctionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.functions(v.asJava)
    }
  }

}

final class ListFunctionsResponseOps(val self: ListFunctionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionsAsScala: Option[Seq[FunctionConfiguration]] =
    Option(self.functions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionsResponseOps {

  implicit def toListFunctionsResponseBuilderOps(v: ListFunctionsResponse.Builder): ListFunctionsResponseBuilderOps =
    new ListFunctionsResponseBuilderOps(v)

  implicit def toListFunctionsResponseOps(v: ListFunctionsResponse): ListFunctionsResponseOps =
    new ListFunctionsResponseOps(v)

}
