// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class FunctionConfigurationBuilderOps(val self: FunctionConfiguration.Builder) extends AnyVal {

  final def withFunctionIdAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.functionId(v)
    }
  } // String

  final def withFunctionArnAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  } // String

  final def withNameAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def withDataSourceNameAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  } // String

  final def withRequestMappingTemplateAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  } // String

  final def withResponseMappingTemplateAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  } // String

  final def withFunctionVersionAsScala(value: Option[String]): FunctionConfiguration.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  } // String

}

final class FunctionConfigurationOps(val self: FunctionConfiguration) extends AnyVal {

  final def functionIdAsScala: Option[String] = Option(self.functionId) // String

  final def functionArnAsScala: Option[String] = Option(self.functionArn) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName) // String

  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate) // String

  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate) // String

  final def functionVersionAsScala: Option[String] = Option(self.functionVersion) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFunctionConfigurationOps {

  implicit def toFunctionConfigurationBuilderOps(v: FunctionConfiguration.Builder): FunctionConfigurationBuilderOps =
    new FunctionConfigurationBuilderOps(v)

  implicit def toFunctionConfigurationOps(v: FunctionConfiguration): FunctionConfigurationOps =
    new FunctionConfigurationOps(v)

}
