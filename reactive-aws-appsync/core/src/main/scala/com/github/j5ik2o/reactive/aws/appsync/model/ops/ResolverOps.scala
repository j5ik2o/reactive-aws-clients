// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class ResolverBuilderOps(val self: Resolver.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.typeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldNameAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.fieldName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceNameAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.dataSourceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolverArnAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.resolverArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestMappingTemplateAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.requestMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def responseMappingTemplateAsScala(value: Option[String]): Resolver.Builder = {
    value.fold(self) { v =>
      self.responseMappingTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def kindAsScala(value: Option[ResolverKind]): Resolver.Builder = {
    value.fold(self) { v =>
      self.kind(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pipelineConfigAsScala(value: Option[PipelineConfig]): Resolver.Builder = {
    value.fold(self) { v =>
      self.pipelineConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def syncConfigAsScala(value: Option[SyncConfig]): Resolver.Builder = {
    value.fold(self) { v =>
      self.syncConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cachingConfigAsScala(value: Option[CachingConfig]): Resolver.Builder = {
    value.fold(self) { v =>
      self.cachingConfig(v)
    }
  }

}

final class ResolverOps(val self: Resolver) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeNameAsScala: Option[String] = Option(self.typeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fieldNameAsScala: Option[String] = Option(self.fieldName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataSourceNameAsScala: Option[String] = Option(self.dataSourceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resolverArnAsScala: Option[String] = Option(self.resolverArn)

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
trait ToResolverOps {

  implicit def toResolverBuilderOps(v: Resolver.Builder): ResolverBuilderOps = new ResolverBuilderOps(v)

  implicit def toResolverOps(v: Resolver): ResolverOps = new ResolverOps(v)

}
