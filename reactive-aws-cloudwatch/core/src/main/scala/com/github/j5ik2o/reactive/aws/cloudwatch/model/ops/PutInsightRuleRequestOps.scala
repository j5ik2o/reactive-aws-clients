// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutInsightRuleRequestBuilderOps(val self: PutInsightRuleRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNameAsScala(value: Option[String]): PutInsightRuleRequest.Builder = {
    value.fold(self) { v => self.ruleName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleStateAsScala(value: Option[String]): PutInsightRuleRequest.Builder = {
    value.fold(self) { v => self.ruleState(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleDefinitionAsScala(value: Option[String]): PutInsightRuleRequest.Builder = {
    value.fold(self) { v => self.ruleDefinition(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): PutInsightRuleRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class PutInsightRuleRequestOps(val self: PutInsightRuleRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNameAsScala: Option[String] = Option(self.ruleName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleStateAsScala: Option[String] = Option(self.ruleState)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleDefinitionAsScala: Option[String] = Option(self.ruleDefinition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutInsightRuleRequestOps {

  implicit def toPutInsightRuleRequestBuilderOps(v: PutInsightRuleRequest.Builder): PutInsightRuleRequestBuilderOps =
    new PutInsightRuleRequestBuilderOps(v)

  implicit def toPutInsightRuleRequestOps(v: PutInsightRuleRequest): PutInsightRuleRequestOps =
    new PutInsightRuleRequestOps(v)

}
