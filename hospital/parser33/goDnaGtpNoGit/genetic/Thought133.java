package genetic;
import java.util.ArrayList;
class Thought133 extends Thought{
private static ArrayList<Thought133> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 798.2936944476795;
private double fd1 = 193.7425033130586;
private Thought fo0 = null;
private Thought fo1 = null;
Thought133 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought133 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought133 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought133 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought133 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought133 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought133 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought133 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought133 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought133 instance = new Thought133 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought133 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought133 instance = new Thought133 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought133 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought133 instance = new Thought133 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought133 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought133 instance = new Thought133 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought133 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought133 instance = new Thought133 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought133 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought133 instance = new Thought133 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought133 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought133 instance = new Thought133 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought133 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought133 instance = new Thought133 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    double ld1 = 20.08674932220436;
    fd0 *= -1;
    lb0 = !fb0;
    fd1 = ld1 - fd0;
    Thought lo2 = Thought216.getInstance(fd1, ld1, fd0, fd1);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    lb0 = fd1 > ld1;
        Thought lo3 = Thought369.getInstance(fb0, fb1, lb0, fb0);
    double ld4 = 306.04326172868156;
    ld4 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld4, fd0, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        fd1 *= -1;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo1.m2(ld1, ld4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        ld1 *= -1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    double ld0 = 977.5239186259178;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fd1 = ld0 - fd0;
    double ld1 = 337.2075858996097;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd0 *= -1;
    Thought lo2 = Thought120.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    fd1 = ld0 + ld1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    if (lb0) {
        fb0 = ad4 < fd0;
        fb1 = lb0 || fb0;
if(fo0 != null){
          fb1 = fo0.m2();
}
        fd1 *= -1;
if(fo1 != null){
          ad1 = fo1.m3(lb0, fb0, fb1, lb0);
}
        boolean lb1 = false;
        ad2 *= -1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb0);
}
        if (fb0) {
            Thought lo2 = Thought14.getInstance(ad1, ad2, ad3, ad4, fb1, lb1, lb0, fb0);
            fb1 = lb1 && lb0;
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb0);
}
            boolean lb3 = true;
            lb0 = fd1 > ad1;
            ad2 *= -1;
if(fo0 != null){
              ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
            fb0 = fb1 || lb3;
            ad4 = fd0 + fd1;
            Thought lo4 = Thought371.getInstance(ad1, ad2, ad3, ad4);
            Thought lo5 = Thought356.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
            ad3 *= -1;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 404.5802372745116;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    ab2 = fd0 > fd1;
    ld0 *= -1;
    ad1 *= -1;
    ad2 *= -1;
    Output.points[4][0] += ad3;
    Thought lo1 = Thought320.getInstance();
    Thought lo2 = Thought227.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        ad1 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
        Thought lo3 = Thought257.getInstance(fo1, fo0, fo1, fo0);
        double ld4 = 566.8952145711478;
        fb0 = fd0 < fd1;
        fb1 = ld4 < ld0;
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ld0);
}
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = ad1 > ad2;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought173.getInstance(fb1, fb0, fb1, fb0);
    fd0 *= -1;
    Output.points[4][1] += fd1;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    double ld1 = 425.2018927048024;
    boolean lb2 = true;
    ld1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
    fb1 = ad3 < ad4;
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    ad1 *= -1;
    ad2 *= -1;
    fb0 = fb1 || lb0;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        Output.points[4][2] += ad1;
        ad2 = ad3 - ad4;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
        fb0 = ad3 < ad4;
        fd0 *= -1;
        fb1 = fd1 < ad1;
        double ld1 = 820.6413718460964;
        lb0 = ad1 > ad2;
        } else {
if(ao1 != null){
          fo1 = ao1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
        fb1 = lb0 && fb0;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
        ab3 = fd0 > fd1;
        ab4 = !fb0;
        fb1 = ab1 && ab2;
        ab3 = fd0 > fd1;
        Output.points[4][3] -= fd0;
        ab4 = fb0 || fb1;
        Output.points[4][4] += fd1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
        ab1 = ab2 && ab3;
    ab4 = ad4 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    Thought lo0 = Thought320.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = ab1 || ab2;
    boolean lb1 = false;
    double ld2 = 938.3119286858321;
    Thought lo3 = Thought15.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
}
    ab3 = fd1 > ld2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    double ld0 = 437.434147172523;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = false;
    ld0 = fd0 + fd1;
    double ld2 = 708.9812639120607;
    lb1 = ld0 < ld2;
    Thought lo3 = Thought129.getInstance(fo0, fo1, fo0, fo1);
    boolean lb4 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ld2);
}

Thought.STACK_COUNTER++;
return lb4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[4][5] -= fd1;
    Thought lo0 = Thought215.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    if (ab1) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo1 = Thought51.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought367.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought312.getInstance(fo1, fo0, fo1, fo0);
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    ad1 = ad2 - ad3;
    lb2 = ad4 > fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    lb3 = fb0 && fb1;
    lb2 = ad3 < ad4;
if(fo1 != null){
      lb3 = fo1.m2();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}
    boolean lb4 = true;
    boolean lb5 = false;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb4, lb5, lb6, fb0);
}
    fb1 = lb2 || lb3;
    ad4 = fd0 + fd1;
    lb4 = ad1 < ad2;
    lb5 = ad3 > ad4;
    lb6 = fb0 && fb1;
    double ld7 = 982.5028611585542;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Output.points[4][6] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 944.1411424763195;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought286.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      fd0 = fo1.m3();
}
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb2, fb0);
}
    fd1 = ld0 + fd0;
    double ld3 = 57.032078165866984;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        double ld4 = 373.9897146614974;
        fd0 *= -1;
        fd1 = ld4 + ld0;
        for(int i1=0; i1<10; i1++){
            double ld5 = 215.76762348621196;
            boolean lb6 = true;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ld3, fd0, fd1, fb0, fb1, lb6, lb2);
}
            fb0 = !fb1;
}}
Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    double ld1 = 317.8244264172202;
    fb0 = fd0 < fd1;
    double ld2 = 498.984527494866;
    Thought lo3 = Thought291.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
    if (lb0) {
        ld1 = ld2 - ad1;
        ad2 = ad3 + ad4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld2, fb0, fb1, lb0, fb0);
}
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
        double ld0 = 107.76245179217895;
        Thought lo1 = Thought5.getInstance(ao2, ao3, ao4, fo0);
        double ld2 = 973.9473342806072;
        fb1 = ab1 || ab2;
        ld0 = ld2 - fd0;
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld0, ld2, fd0);
}
        boolean lb3 = false;
        boolean lb4 = true;
        fd1 = ld0 - ld2;
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld2);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          ao3.m1(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ld2, fd0, fb1, lb3, lb4, ab1);
}
        boolean lb5 = true;
        ab1 = fd1 > ld0;
if(ao4 != null){
          ao3 = ao4.m4(ld2, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
        Output.points[4][7] += ld2;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb3, lb4, lb5);
}
        Output.points[4][8] += fd1;
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    double ld0 = 816.1669178673825;
    Output.points[5][0] -= ad2;
    ad3 = ad4 + fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
    boolean lb1 = true;
    if (ab1) {
        ab2 = fd1 > ld0;
        Thought lo2 = Thought217.getInstance(ab3, ab4, fb0, fb1);
        lb1 = ad1 < ad2;
        Output.points[5][1] -= ad3;
        double ld3 = 607.0685138650865;
        double ld4 = 739.1753927352354;
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    Thought lo0 = Thought371.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Thought lo1 = Thought256.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    Output.points[5][2] += fd1;
    double ld2 = 420.1258332767633;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    double ld3 = 799.2180895392542;
    double ld4 = 434.1931531751902;
    fb1 = ld2 > ld3;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld2, fb1, fb0, fb1, fb0);
}
    fb1 = ld3 < ld4;
        fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(ld3, ld4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld2 = ld3 + ld4;
    fb0 = fd0 < fd1;
    Thought lo5 = Thought300.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought73.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought361.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought366.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld4 = 66.70426765915127;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return ld4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    boolean lb2 = true;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought244.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
if(fo0 != null){
          fo1 = fo0.m4();
}
    lb1 = lb2 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
}
    double ld4 = 424.7198378283495;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ld4 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
    lb1 = !lb2;
    boolean lb5 = false;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo6 = Thought208.getInstance(fd0, fd1, ld4, ad1);
    boolean lb7 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      lb5 = fo1.m2();
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 || ab1;
    Output.points[5][3] -= fd0;
    Output.points[5][4] -= fd1;
    ab2 = ad1 > ad2;
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought52.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    Output.points[5][5] -= ad1;
    ad2 = ad3 - ad4;
    fb0 = fb1 || lb0;
    fd0 *= -1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb1, lb3, ab1, ab2);
}

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    boolean lb1 = true;
    double ld2 = 499.72857154864613;
if(ao1 != null){
      fo1 = ao1.m4(ld2, fd0, fd1, ld2);
}
    Output.points[5][6] += fd0;
    boolean lb3 = false;
    Output.points[5][7] += fd1;
    boolean lb4 = true;
    lb0 = !lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
}
    lb3 = lb4 && fb0;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, lb1, lb3);
}
    Output.points[5][8] -= fd0;
    boolean lb5 = false;
if(fo0 != null){
      lb4 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1, lb5, fb0, fb1, lb0);
}
if(ao4 != null){
      ld2 = ao4.m3(fd0, fd1, ld2, fd0, lb1, lb3, lb4, lb5);
}
        fb0 = fb1 || lb0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    double ld0 = 269.5451832681113;
    fb1 = !fb0;
    Thought lo1 = Thought242.getInstance(ao1, ao2, ao3, ao4);
    fb1 = ad3 > ad4;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 < ld0;
    Thought lo2 = Thought270.getInstance(fb1, fb0, fb1, fb0);
    Output.points[6][0] -= ad1;
    Thought lo3 = Thought150.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    double ld4 = 254.7878754342422;
    fb1 = !fb0;
    fd0 = fd1 + ld0;
    Output.points[6][1] -= ld4;
    fb1 = fb0 || fb1;
    Output.points[6][2] += ad1;
    ad2 *= -1;
    fb0 = fb1 || fb0;
    ad3 *= -1;
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb5, fb0);
}

Thought.STACK_COUNTER++;
return ld4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    Output.points[6][3] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb0, ab1, ab2);
}
    ab3 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought143.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb1 = !ab1;
    ad2 = ad3 + ad4;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3);
}
    ab2 = ad4 > fd0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    double ld1 = 280.52018670086045;
if(ao4 != null){
      ab3 = ao4.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    Thought lo2 = Thought238.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      ab2 = fo0.m2(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ab1 = ld1 > ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ad1);
}
    boolean lb3 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[6][4] -= fd0;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    Thought lo2 = Thought240.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought368.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    fb0 = fb1 && lb0;
    lb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[6][5] += fd0;
if(fo0 != null){
      ab1 = fo0.m2();
}
    double ld0 = 884.9259076187702;
    if (ab2) {
        Output.points[6][6] -= fd0;
        boolean lb1 = true;
        if (ab2) {
            boolean lb2 = false;
            ab2 = !ab3;
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 410.23901430070964;
    fb1 = ld0 < ad1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        Thought lo1 = Thought326.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ld0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    Output.points[6][7] += ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb0 = true;
    Thought lo1 = Thought76.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    double ld2 = 300.0531102090428;
    if (ab4) {
        boolean lb3 = false;
        ab4 = fd0 > fd1;
        fb0 = ld2 < ad1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    double ld0 = 740.2749089976029;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld0 = fd0 - fd1;
    fb0 = fb1 && fb0;
    double ld1 = 232.4315970589181;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld1, fd0, fd1);
}
if(ao2 != null){
      ld0 = ao2.m3();
}
    boolean lb2 = false;
if(ao3 != null){
      ld1 = ao3.m3(fb0, fb1, lb2, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ld1, fd0, fb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    lb2 = lb3 && fb0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld0, ld1, fd0, fb1, lb2, lb3, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb2, lb3, fb0, fb1);
}
    double ld4 = 461.8582494531143;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb5 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, ld1);
}
    lb2 = lb3 || lb5;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ld4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
        double ld0 = 821.2056208056413;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld1 = 996.0195003973539;
    if (fb0) {
        fb1 = !fb0;
        } else {
        fb1 = ad4 < fd0;
        fb0 = fb1 && fb0;
        fd1 *= -1;
        ld0 *= -1;
        ld1 = ad1 + ad2;
        double ld2 = 449.1259998934928;
        Thought lo3 = Thought74.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
            fb1 = fb0 || fb1;
            boolean lb4 = false;
            Output.points[6][8] += fd1;
if(ao2 != null){
              ao2.m3(ao3, ao4, fo0, fo1);
}
}}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Output.points[7][0] += fd0;
    ab2 = !ab3;
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = !fb1;
        lb0 = !ab1;
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    Thought lo2 = Thought4.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    double ld3 = 790.7847967316108;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
        ab1 = ab2 && ab3;
    ad2 = ad3 - ad4;
    boolean lb4 = true;
    Output.points[7][1] += fd0;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    lb0 = lb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || lb1;
    boolean lb2 = true;
    fd0 *= -1;
    Thought lo3 = Thought176.getInstance();
    Thought lo4 = Thought301.getInstance(lb2, fb0, fb1, lb0);
    boolean lb5 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, lb5, fb0, fb1);
}
    Thought lo6 = Thought382.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, lb2, lb5);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[7][3] += fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    double ld1 = 899.2429680984856;
    lb0 = fb0 && fb1;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    lb0 = ld1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    Output.points[7][4] += fd0;
    fb1 = fd1 > ld1;
    lb0 = fb0 && fb1;
    fd0 = fd1 - ld1;
    double ld2 = 979.8162137658201;
    lb0 = fb0 || fb1;
    double ld3 = 247.4827297351001;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ld2 *= -1;
    fb0 = fb1 || lb0;
    double ld4 = 680.9910818249299;
if(fo1 != null){
      fb0 = fo1.m2(ld3, ld4, fd0, fd1);
}
    double ld5 = 705.7418803228411;
    boolean lb6 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought125.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1();
}
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    fb0 = fd1 < fd0;
    Thought lo2 = Thought305.getInstance(fb1, lb1, fb0, fb1);
    boolean lb3 = false;
    Output.points[7][5] -= fd1;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb1);
}
    lb3 = fb0 && fb1;
    Thought lo4 = Thought263.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
