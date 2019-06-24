// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateFunctionRequestBuilderOps(val self: CreateFunctionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceNameAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestMappingTemplateAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseMappingTemplateAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionVersionAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  }

}

final class CreateFunctionRequestOps(val self: CreateFunctionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

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
trait ToCreateFunctionRequestOps {

  implicit def toCreateFunctionRequestBuilderOps(v: CreateFunctionRequest.Builder): CreateFunctionRequestBuilderOps =
    new CreateFunctionRequestBuilderOps(v)

  implicit def toCreateFunctionRequestOps(v: CreateFunctionRequest): CreateFunctionRequestOps =
    new CreateFunctionRequestOps(v)

}
