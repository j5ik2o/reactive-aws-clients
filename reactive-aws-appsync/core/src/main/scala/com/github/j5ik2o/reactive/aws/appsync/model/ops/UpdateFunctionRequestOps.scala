// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateFunctionRequestBuilderOps(val self: UpdateFunctionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionIdAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceNameAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestMappingTemplateAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseMappingTemplateAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionVersionAsScala(value: Option[String]): UpdateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  }

}

final class UpdateFunctionRequestOps(val self: UpdateFunctionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionIdAsScala: Option[String] = Option(self.functionId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionVersionAsScala: Option[String] = Option(self.functionVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionRequestOps {

  implicit def toUpdateFunctionRequestBuilderOps(v: UpdateFunctionRequest.Builder): UpdateFunctionRequestBuilderOps =
    new UpdateFunctionRequestBuilderOps(v)

  implicit def toUpdateFunctionRequestOps(v: UpdateFunctionRequest): UpdateFunctionRequestOps =
    new UpdateFunctionRequestOps(v)

}
