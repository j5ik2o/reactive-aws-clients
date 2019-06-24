// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class GetFunctionResponseBuilderOps(val self: GetFunctionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configurationAsScala(value: Option[FunctionConfiguration]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.configuration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[FunctionCodeLocation]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): GetFunctionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def concurrencyAsScala(value: Option[Concurrency]): GetFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.concurrency(v)
    }
  }

}

final class GetFunctionResponseOps(val self: GetFunctionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configurationAsScala: Option[FunctionConfiguration] = Option(self.configuration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[FunctionCodeLocation] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def concurrencyAsScala: Option[Concurrency] = Option(self.concurrency)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetFunctionResponseOps {

  implicit def toGetFunctionResponseBuilderOps(v: GetFunctionResponse.Builder): GetFunctionResponseBuilderOps =
    new GetFunctionResponseBuilderOps(v)

  implicit def toGetFunctionResponseOps(v: GetFunctionResponse): GetFunctionResponseOps = new GetFunctionResponseOps(v)

}
