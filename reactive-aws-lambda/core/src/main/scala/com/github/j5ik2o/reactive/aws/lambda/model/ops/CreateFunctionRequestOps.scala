// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class CreateFunctionRequestBuilderOps(val self: CreateFunctionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def runtimeAsScala(value: Option[Runtime]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.runtime(v)
    }
  } // Runtime

  final def roleAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.role(v)
    }
  } // String

  final def handlerAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.handler(v)
    }
  } // String

  final def codeAsScala(value: Option[FunctionCode]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.code(v)
    }
  } // FunctionCode

  final def descriptionAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def timeoutAsScala(value: Option[Int]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.timeout(v)
    }
  } // Int

  final def memorySizeAsScala(value: Option[Int]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.memorySize(v)
    }
  } // Int

  final def publishAsScala(value: Option[Boolean]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.publish(v)
    }
  } // Boolean

  final def vpcConfigAsScala(value: Option[VpcConfig]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.vpcConfig(v)
    }
  } // VpcConfig

  final def deadLetterConfigAsScala(value: Option[DeadLetterConfig]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.deadLetterConfig(v)
    }
  } // DeadLetterConfig

  final def environmentAsScala(value: Option[Environment]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.environment(v)
    }
  } // Environment

  final def kmsKeyArnAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.kmsKeyArn(v)
    }
  } // String

  final def tracingConfigAsScala(value: Option[TracingConfig]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.tracingConfig(v)
    }
  } // TracingConfig

  final def tagsAsScala(value: Option[Map[String, String]]): CreateFunctionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Map[String, String]
  }

  final def layersAsScala(value: Option[Seq[String]]): CreateFunctionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layers(v.asJava)
    } // Seq[String]
  }

}

final class CreateFunctionRequestOps(val self: CreateFunctionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def runtimeAsScala: Option[Runtime] = Option(self.runtime) // Runtime

  final def roleAsScala: Option[String] = Option(self.role) // String

  final def handlerAsScala: Option[String] = Option(self.handler) // String

  final def codeAsScala: Option[FunctionCode] = Option(self.code) // FunctionCode

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def timeoutAsScala: Option[Int] = Option(self.timeout) // Int

  final def memorySizeAsScala: Option[Int] = Option(self.memorySize) // Int

  final def publishAsScala: Option[Boolean] = Option(self.publish) // Boolean

  final def vpcConfigAsScala: Option[VpcConfig] = Option(self.vpcConfig) // VpcConfig

  final def deadLetterConfigAsScala: Option[DeadLetterConfig] = Option(self.deadLetterConfig) // DeadLetterConfig

  final def environmentAsScala: Option[Environment] = Option(self.environment) // Environment

  final def kmsKeyArnAsScala: Option[String] = Option(self.kmsKeyArn) // String

  final def tracingConfigAsScala: Option[TracingConfig] = Option(self.tracingConfig) // TracingConfig

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

  final def layersAsScala: Option[Seq[String]] = Option(self.layers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFunctionRequestOps {

  implicit def toCreateFunctionRequestBuilderOps(v: CreateFunctionRequest.Builder): CreateFunctionRequestBuilderOps =
    new CreateFunctionRequestBuilderOps(v)

  implicit def toCreateFunctionRequestOps(v: CreateFunctionRequest): CreateFunctionRequestOps =
    new CreateFunctionRequestOps(v)

}
