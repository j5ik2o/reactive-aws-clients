// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ResourcePolicyBuilderOps(val self: ResourcePolicy.Builder) extends AnyVal {

  final def policyNameAsScala(value: Option[String]): ResourcePolicy.Builder = {
    value.fold(self) { v =>
      self.policyName(v)
    }
  } // String

  final def policyDocumentAsScala(value: Option[String]): ResourcePolicy.Builder = {
    value.fold(self) { v =>
      self.policyDocument(v)
    }
  } // String

  final def lastUpdatedTimeAsScala(value: Option[Long]): ResourcePolicy.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTime(v)
    }
  } // Long

}

final class ResourcePolicyOps(val self: ResourcePolicy) extends AnyVal {

  final def policyNameAsScala: Option[String] = Option(self.policyName) // String

  final def policyDocumentAsScala: Option[String] = Option(self.policyDocument) // String

  final def lastUpdatedTimeAsScala: Option[Long] = Option(self.lastUpdatedTime) // Long

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourcePolicyOps {

  implicit def toResourcePolicyBuilderOps(v: ResourcePolicy.Builder): ResourcePolicyBuilderOps =
    new ResourcePolicyBuilderOps(v)

  implicit def toResourcePolicyOps(v: ResourcePolicy): ResourcePolicyOps = new ResourcePolicyOps(v)

}
