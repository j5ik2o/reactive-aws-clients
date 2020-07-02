// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ContinueUpdateRollbackRequestBuilderOps(val self: ContinueUpdateRollbackRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): ContinueUpdateRollbackRequest.Builder = {
    value.fold(self) { v => self.stackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleARNAsScala(value: Option[String]): ContinueUpdateRollbackRequest.Builder = {
    value.fold(self) { v => self.roleARN(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesToSkipAsScala(value: Option[Seq[String]]): ContinueUpdateRollbackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourcesToSkip(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): ContinueUpdateRollbackRequest.Builder = {
    value.fold(self) { v => self.clientRequestToken(v) }
  }

}

final class ContinueUpdateRollbackRequestOps(val self: ContinueUpdateRollbackRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleARNAsScala: Option[String] = Option(self.roleARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesToSkipAsScala: Option[Seq[String]] =
    Option(self.resourcesToSkip).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContinueUpdateRollbackRequestOps {

  implicit def toContinueUpdateRollbackRequestBuilderOps(
      v: ContinueUpdateRollbackRequest.Builder
  ): ContinueUpdateRollbackRequestBuilderOps = new ContinueUpdateRollbackRequestBuilderOps(v)

  implicit def toContinueUpdateRollbackRequestOps(v: ContinueUpdateRollbackRequest): ContinueUpdateRollbackRequestOps =
    new ContinueUpdateRollbackRequestOps(v)

}
