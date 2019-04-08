// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateFunctionRequestBuilderOps(val self: CreateFunctionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def runtimeAsScala(value: Option[Runtime]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.runtime(v)
    }
  }

  final def roleAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  }

  final def handlerAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.handler(v)
    }
  }

  final def codeAsScala(value: Option[FunctionCode]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def timeoutAsScala(value: Option[Int]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  }

  final def memorySizeAsScala(value: Option[Int]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.memorySize(v)
    }
  }

  final def publishAsScala(value: Option[Boolean]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.publish(v)
    }
  }

  final def vpcConfigAsScala(value: Option[VpcConfig]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.vpcConfig(v)
    }
  }

  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.deadLetterConfig(v)
    }
  }

  final def environmentAsScala(value: Option[Environment]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.environment(v)
    }
  }

  final def kmsKeyArnAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyArn(v)
    }
  }

  final def tracingConfigAsScala(value: Option[TracingConfig]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.tracingConfig(v)
    }
  }

  final def tagsAsScala(value: Option[Map[String, String]]): CreateFunctionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def layersAsScala(value: Option[Seq[String]]): CreateFunctionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layers(v.asJava)
    }
  }

}

final class CreateFunctionRequestOps(val self: CreateFunctionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def runtimeAsScala: Option[Runtime] = Option(self.runtime)

  final def roleAsScala: Option[String] = Option(self.role)

  final def handlerAsScala: Option[String] = Option(self.handler)

  final def codeAsScala: Option[FunctionCode] = Option(self.code)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def timeoutAsScala: Option[Int] = Option(self.timeout)

  final def memorySizeAsScala: Option[Int] = Option(self.memorySize)

  final def publishAsScala: Option[Boolean] = Option(self.publish)

  final def vpcConfigAsScala: Option[VpcConfig] = Option(self.vpcConfig)

  final def deadLetterConfigAsScala: Option[DeadLetterConfig] = Option(self.deadLetterConfig)

  final def environmentAsScala: Option[Environment] = Option(self.environment)

  final def kmsKeyArnAsScala: Option[String] = Option(self.kmsKeyArn)

  final def tracingConfigAsScala: Option[TracingConfig] = Option(self.tracingConfig)

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def layersAsScala: Option[Seq[String]] = Option(self.layers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFunctionRequestOps {

  implicit def toCreateFunctionRequestBuilderOps(v: CreateFunctionRequest.Builder): CreateFunctionRequestBuilderOps =
    new CreateFunctionRequestBuilderOps(v)

  implicit def toCreateFunctionRequestOps(v: CreateFunctionRequest): CreateFunctionRequestOps =
    new CreateFunctionRequestOps(v)

}
