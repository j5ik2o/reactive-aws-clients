// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class UpdateResolverRequestBuilderOps(val self: UpdateResolverRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala(value: Option[String]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.apiId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldNameAsScala(value: Option[String]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.fieldName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceNameAsScala(value: Option[String]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestMappingTemplateAsScala(value: Option[String]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseMappingTemplateAsScala(value: Option[String]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kindAsScala(value: Option[ResolverKind]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.kind(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pipelineConfigAsScala(value: Option[PipelineConfig]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.pipelineConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def syncConfigAsScala(value: Option[SyncConfig]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.syncConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cachingConfigAsScala(value: Option[CachingConfig]): UpdateResolverRequest.Builder = {
    value.fold(self) { v =>
      self.cachingConfig(v)
    }
  }

}

final class UpdateResolverRequestOps(val self: UpdateResolverRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def apiIdAsScala: Option[String] = Option(self.apiId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldNameAsScala: Option[String] = Option(self.fieldName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestMappingTemplateAsScala: Option[String] = Option(self.requestMappingTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseMappingTemplateAsScala: Option[String] = Option(self.responseMappingTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kindAsScala: Option[ResolverKind] = Option(self.kind)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pipelineConfigAsScala: Option[PipelineConfig] = Option(self.pipelineConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def syncConfigAsScala: Option[SyncConfig] = Option(self.syncConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cachingConfigAsScala: Option[CachingConfig] = Option(self.cachingConfig)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateResolverRequestOps {

  implicit def toUpdateResolverRequestBuilderOps(v: UpdateResolverRequest.Builder): UpdateResolverRequestBuilderOps =
    new UpdateResolverRequestBuilderOps(v)

  implicit def toUpdateResolverRequestOps(v: UpdateResolverRequest): UpdateResolverRequestOps =
    new UpdateResolverRequestOps(v)

}
