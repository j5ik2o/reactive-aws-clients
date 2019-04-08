// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateFunctionRequestBuilderOps(val self: UpdateFunctionRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  final def nameAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def functionIdAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionId(v)
    }
  }

  final def dataSourceNameAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  }

  final def requestMappingTemplateAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  }

  final def responseMappingTemplateAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  }

  final def functionVersionAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  }

}

final class UpdateFunctionRequestOps(val self: UpdateFunctionRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId)

  final def nameAsScala: Option[String] = Option(self.name)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def functionIdAsScala: Option[String] = Option(self.functionId)

  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName)

  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate)

  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate)

  final def functionVersionAsScala: Option[String] = Option(self.functionVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionRequestOps {

  implicit def toUpdateFunctionRequestBuilderOps(v: UpdateFunctionRequest.Builder): UpdateFunctionRequestBuilderOps =
    new UpdateFunctionRequestBuilderOps(v)

  implicit def toUpdateFunctionRequestOps(v: UpdateFunctionRequest): UpdateFunctionRequestOps =
    new UpdateFunctionRequestOps(v)

}
