// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateFunctionRequestBuilderOps(val self: CreateFunctionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.functionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeAsScala(value: Option[Runtime]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.runtime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.role(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def handlerAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.handler(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[FunctionCode]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.code(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala(value: Option[Int]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.timeout(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memorySizeAsScala(value: Option[Int]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.memorySize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publishAsScala(value: Option[Boolean]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.publish(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcConfigAsScala(value: Option[VpcConfig]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.vpcConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.deadLetterConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala(value: Option[Environment]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.environment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyArnAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.kmsKeyArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tracingConfigAsScala(value: Option[TracingConfig]): CreateFunctionRequest.Builder = {
    value.fold(self) { v => self.tracingConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): CreateFunctionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala(value: Option[Seq[String]]): CreateFunctionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.layers(v.asJava)
    }
  }

}

final class CreateFunctionRequestOps(val self: CreateFunctionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runtimeAsScala: Option[Runtime] = Option(self.runtime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleAsScala: Option[String] = Option(self.role)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def handlerAsScala: Option[String] = Option(self.handler)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[FunctionCode] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutAsScala: Option[Int] = Option(self.timeout)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memorySizeAsScala: Option[Int] = Option(self.memorySize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def publishAsScala: Option[Boolean] = Option(self.publish)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcConfigAsScala: Option[VpcConfig] = Option(self.vpcConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deadLetterConfigAsScala: Option[DeadLetterConfig] = Option(self.deadLetterConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala: Option[Environment] = Option(self.environment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kmsKeyArnAsScala: Option[String] = Option(self.kmsKeyArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tracingConfigAsScala: Option[TracingConfig] = Option(self.tracingConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layersAsScala: Option[Seq[String]] =
    Option(self.layers).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFunctionRequestOps {

  implicit def toCreateFunctionRequestBuilderOps(v: CreateFunctionRequest.Builder): CreateFunctionRequestBuilderOps =
    new CreateFunctionRequestBuilderOps(v)

  implicit def toCreateFunctionRequestOps(v: CreateFunctionRequest): CreateFunctionRequestOps =
    new CreateFunctionRequestOps(v)

}
