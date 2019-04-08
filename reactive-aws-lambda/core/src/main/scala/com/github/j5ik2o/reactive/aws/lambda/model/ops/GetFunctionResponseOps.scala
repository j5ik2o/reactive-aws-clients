// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionResponseBuilderOps(val self: GetFunctionResponse.Builder) extends AnyVal {

  final def configurationAsScala(value: Option[FunctionConfiguration]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.configuration(v)
    }
  }

  final def codeAsScala(value: Option[FunctionCodeLocation]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def tagsAsScala(value: Option[Map[String, String]]): GetFunctionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def concurrencyAsScala(value: Option[Concurrency]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.concurrency(v)
    }
  }

}

final class GetFunctionResponseOps(val self: GetFunctionResponse) extends AnyVal {

  final def configurationAsScala: Option[FunctionConfiguration] = Option(self.configuration)

  final def codeAsScala: Option[FunctionCodeLocation] = Option(self.code)

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def concurrencyAsScala: Option[Concurrency] = Option(self.concurrency)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionResponseOps {

  implicit def toGetFunctionResponseBuilderOps(v: GetFunctionResponse.Builder): GetFunctionResponseBuilderOps =
    new GetFunctionResponseBuilderOps(v)

  implicit def toGetFunctionResponseOps(v: GetFunctionResponse): GetFunctionResponseOps = new GetFunctionResponseOps(v)

}
