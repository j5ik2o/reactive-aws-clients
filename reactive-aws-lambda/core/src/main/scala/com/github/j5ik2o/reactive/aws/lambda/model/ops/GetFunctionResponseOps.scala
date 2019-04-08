// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionResponseBuilderOps(val self: GetFunctionResponse.Builder) extends AnyVal {

  final def configurationAsScala(value: Option[FunctionConfiguration]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.configuration(v)
    }
  } // FunctionConfiguration

  final def codeAsScala(value: Option[FunctionCodeLocation]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  } // FunctionCodeLocation

  final def tagsAsScala(value: Option[Map[String, String]]): GetFunctionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Map[String, String]
  }

  final def concurrencyAsScala(value: Option[Concurrency]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.concurrency(v)
    }
  } // Concurrency

}

final class GetFunctionResponseOps(val self: GetFunctionResponse) extends AnyVal {

  final def configurationAsScala: Option[FunctionConfiguration] = Option(self.configuration) // FunctionConfiguration

  final def codeAsScala: Option[FunctionCodeLocation] = Option(self.code) // FunctionCodeLocation

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def concurrencyAsScala: Option[Concurrency] = Option(self.concurrency) // Concurrency

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionResponseOps {

  implicit def toGetFunctionResponseBuilderOps(v: GetFunctionResponse.Builder): GetFunctionResponseBuilderOps =
    new GetFunctionResponseBuilderOps(v)

  implicit def toGetFunctionResponseOps(v: GetFunctionResponse): GetFunctionResponseOps = new GetFunctionResponseOps(v)

}
