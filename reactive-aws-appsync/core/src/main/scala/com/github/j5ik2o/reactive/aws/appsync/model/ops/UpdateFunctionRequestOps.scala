// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateFunctionRequestBuilderOps(val self: UpdateFunctionRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def nameAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def functionIdAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionId(v)
    }
  } // String

  final def dataSourceNameAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  } // String

  final def requestMappingTemplateAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  } // String

  final def responseMappingTemplateAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  } // String

  final def functionVersionAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  } // String

}

final class UpdateFunctionRequestOps(val self: UpdateFunctionRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def functionIdAsScala: Option[String] = Option(self.functionId) // String

  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName) // String

  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate) // String

  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate) // String

  final def functionVersionAsScala: Option[String] = Option(self.functionVersion) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionRequestOps {

  implicit def toUpdateFunctionRequestBuilderOps(v: UpdateFunctionRequest.Builder): UpdateFunctionRequestBuilderOps =
    new UpdateFunctionRequestBuilderOps(v)

  implicit def toUpdateFunctionRequestOps(v: UpdateFunctionRequest): UpdateFunctionRequestOps =
    new UpdateFunctionRequestOps(v)

}
