// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class FunctionConfigurationBuilderOps(val self: FunctionConfiguration.Builder) extends AnyVal {

  final def functionIdAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.functionId(v)
    }
  }

  final def functionArnAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  }

  final def nameAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def dataSourceNameAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  }

  final def requestMappingTemplateAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  }

  final def responseMappingTemplateAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  }

  final def functionVersionAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  }

}

final class FunctionConfigurationOps(val self: FunctionConfiguration) extends AnyVal {

  final def functionIdAsScala: Option[String] = Option(self.functionId)

  final def functionArnAsScala: Option[String] = Option(self.functionArn)

  final def nameAsScala: Option[String] = Option(self.name)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName)

  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate)

  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate)

  final def functionVersionAsScala: Option[String] = Option(self.functionVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFunctionConfigurationOps {

  implicit def toFunctionConfigurationBuilderOps(v: FunctionConfiguration.Builder): FunctionConfigurationBuilderOps =
    new FunctionConfigurationBuilderOps(v)

  implicit def toFunctionConfigurationOps(v: FunctionConfiguration): FunctionConfigurationOps =
    new FunctionConfigurationOps(v)

}
