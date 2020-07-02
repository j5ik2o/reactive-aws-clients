// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class IssueBuilderOps(val self: Issue.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[NodegroupIssueCode]): Issue.Builder = {
    value.fold(self) { v => self.code(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): Issue.Builder = {
    value.fold(self) { v => self.message(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdsAsScala(value: Option[Seq[String]]): Issue.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceIds(v.asJava)
    }
  }

}

final class IssueOps(val self: Issue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[NodegroupIssueCode] = Option(self.code)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdsAsScala: Option[Seq[String]] =
    Option(self.resourceIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToIssueOps {

  implicit def toIssueBuilderOps(v: Issue.Builder): IssueBuilderOps = new IssueBuilderOps(v)

  implicit def toIssueOps(v: Issue): IssueOps = new IssueOps(v)

}
