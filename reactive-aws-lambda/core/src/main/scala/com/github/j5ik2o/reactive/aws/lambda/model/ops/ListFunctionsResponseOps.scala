// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListFunctionsResponseBuilderOps(val self: ListFunctionsResponse.Builder) extends AnyVal {

  final def nextMarkerAsScala(value: Option[String]): ListFunctionsResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  } // String

  final def functionsAsScala(value: Option[Seq[FunctionConfiguration]]): ListFunctionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.functions(v.asJava)
    } // Seq[FunctionConfiguration]
  }

}

final class ListFunctionsResponseOps(val self: ListFunctionsResponse) extends AnyVal {

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker) // String

  final def functionsAsScala: Option[Seq[FunctionConfiguration]] = Option(self.functions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[FunctionConfiguration]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFunctionsResponseOps {

  implicit def toListFunctionsResponseBuilderOps(v: ListFunctionsResponse.Builder): ListFunctionsResponseBuilderOps =
    new ListFunctionsResponseBuilderOps(v)

  implicit def toListFunctionsResponseOps(v: ListFunctionsResponse): ListFunctionsResponseOps =
    new ListFunctionsResponseOps(v)

}
