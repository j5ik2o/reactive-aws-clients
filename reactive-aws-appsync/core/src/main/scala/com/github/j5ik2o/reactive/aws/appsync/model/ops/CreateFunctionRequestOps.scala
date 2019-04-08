// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class CreateFunctionRequestBuilderOps(val self: CreateFunctionRequest.Builder) extends AnyVal {

  final def apiIdAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  } // String

  final def nameAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def dataSourceNameAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  } // String

  final def requestMappingTemplateAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  } // String

  final def responseMappingTemplateAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  } // String

  final def functionVersionAsScala(value: Option[String]): CreateFunctionRequest.Builder = {
    value.fold(self) { v =>
      self.functionVersion(v)
    }
  } // String

}

final class CreateFunctionRequestOps(val self: CreateFunctionRequest) extends AnyVal {

  final def apiIdAsScala: Option[String] = Option(self.apiId) // String

  final def nameAsScala: Option[String] = Option(self.name) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName) // String

  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate) // String

  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate) // String

  final def functionVersionAsScala: Option[String] = Option(self.functionVersion) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFunctionRequestOps {

  implicit def toCreateFunctionRequestBuilderOps(v: CreateFunctionRequest.Builder): CreateFunctionRequestBuilderOps =
    new CreateFunctionRequestBuilderOps(v)

  implicit def toCreateFunctionRequestOps(v: CreateFunctionRequest): CreateFunctionRequestOps =
    new CreateFunctionRequestOps(v)

}
