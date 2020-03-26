// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class UpdateElasticsearchDomainConfigRequestBuilderOps(val self: UpdateElasticsearchDomainConfigRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchClusterConfigAsScala(
      value: Option[ElasticsearchClusterConfig]
  ): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.elasticsearchClusterConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptionsAsScala(value: Option[EBSOptions]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.ebsOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotOptionsAsScala(value: Option[SnapshotOptions]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.snapshotOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcOptionsAsScala(value: Option[VPCOptions]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.vpcOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cognitoOptionsAsScala(value: Option[CognitoOptions]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.cognitoOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedOptionsAsScala(
      value: Option[Map[String, String]]
  ): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.advancedOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPoliciesAsScala(value: Option[String]): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.accessPolicies(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logPublishingOptionsAsScala(
      value: Option[Map[LogType, LogPublishingOption]]
  ): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logPublishingOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainEndpointOptionsAsScala(
      value: Option[DomainEndpointOptions]
  ): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.domainEndpointOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedSecurityOptionsAsScala(
      value: Option[AdvancedSecurityOptionsInput]
  ): UpdateElasticsearchDomainConfigRequest.Builder = {
    value.fold(self) { v =>
      self.advancedSecurityOptions(v)
    }
  }

}

final class UpdateElasticsearchDomainConfigRequestOps(val self: UpdateElasticsearchDomainConfigRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def elasticsearchClusterConfigAsScala: Option[ElasticsearchClusterConfig] =
    Option(self.elasticsearchClusterConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ebsOptionsAsScala: Option[EBSOptions] = Option(self.ebsOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotOptionsAsScala: Option[SnapshotOptions] = Option(self.snapshotOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcOptionsAsScala: Option[VPCOptions] = Option(self.vpcOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cognitoOptionsAsScala: Option[CognitoOptions] = Option(self.cognitoOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedOptionsAsScala: Option[Map[String, String]] = Option(self.advancedOptions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accessPoliciesAsScala: Option[String] = Option(self.accessPolicies)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logPublishingOptionsAsScala: Option[Map[LogType, LogPublishingOption]] =
    Option(self.logPublishingOptions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainEndpointOptionsAsScala: Option[DomainEndpointOptions] = Option(self.domainEndpointOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def advancedSecurityOptionsAsScala: Option[AdvancedSecurityOptionsInput] = Option(self.advancedSecurityOptions)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateElasticsearchDomainConfigRequestOps {

  implicit def toUpdateElasticsearchDomainConfigRequestBuilderOps(
      v: UpdateElasticsearchDomainConfigRequest.Builder
  ): UpdateElasticsearchDomainConfigRequestBuilderOps = new UpdateElasticsearchDomainConfigRequestBuilderOps(v)

  implicit def toUpdateElasticsearchDomainConfigRequestOps(
      v: UpdateElasticsearchDomainConfigRequest
  ): UpdateElasticsearchDomainConfigRequestOps = new UpdateElasticsearchDomainConfigRequestOps(v)

}
