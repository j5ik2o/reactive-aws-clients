// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ContinueUpdateRollbackRequestBuilderOps(val self: ContinueUpdateRollbackRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): ContinueUpdateRollbackRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def roleARNAsScala(value: Option[String]): ContinueUpdateRollbackRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  } // String

  final def resourcesToSkipAsScala(value: Option[Seq[String]]): ContinueUpdateRollbackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourcesToSkip(v.asJava)
    } // Seq[String]
  }

  final def clientRequestTokenAsScala(value: Option[String]): ContinueUpdateRollbackRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  } // String

}

final class ContinueUpdateRollbackRequestOps(val self: ContinueUpdateRollbackRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def roleARNAsScala: Option[String] = Option(self.roleARN) // String

  final def resourcesToSkipAsScala: Option[Seq[String]] = Option(self.resourcesToSkip).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContinueUpdateRollbackRequestOps {

  implicit def toContinueUpdateRollbackRequestBuilderOps(
      v: ContinueUpdateRollbackRequest.Builder
  ): ContinueUpdateRollbackRequestBuilderOps = new ContinueUpdateRollbackRequestBuilderOps(v)

  implicit def toContinueUpdateRollbackRequestOps(v: ContinueUpdateRollbackRequest): ContinueUpdateRollbackRequestOps =
    new ContinueUpdateRollbackRequestOps(v)

}
