package genetic;
import java.util.ArrayList;
class Thought354 extends Thought{
private static ArrayList<Thought354> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 738.088217101594;
private double fd1 = 786.9566697619086;
private Thought fo0 = null;
private Thought fo1 = null;
Thought354 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought354 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought354 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought354 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought354 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought354 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought354 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought354 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought354 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought354 instance = new Thought354 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought354 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought354 instance = new Thought354 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought354 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought354 instance = new Thought354 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought354 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought354 instance = new Thought354 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought354 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought354 instance = new Thought354 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought354 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought354 instance = new Thought354 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought354 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought354 instance = new Thought354 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought354 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought354 instance = new Thought354 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought97.getInstance();
    fd1 = fd0 + fd1;
    double ld1 = 163.9811635004764;
    fb1 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[5][5] += fd1;
    fb0 = ld1 > fd0;
    Thought lo2 = Thought293.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1);
}
    fb1 = fb0 || fb1;
    double ld3 = 233.82539838151934;
    Output.points[5][6] += ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    if (fb0) {
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
    double ld0 = 110.60856896926452;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb1;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    Output.points[5][7] += ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Thought lo2 = Thought8.getInstance();
    fd1 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = ld0 < fd0;
    for(int i0=0; i0<10; i0++){
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
    Thought lo0 = Thought159.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    fb0 = ad1 > ad2;
    Output.points[5][8] += ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld1 = 977.6870826665428;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1);
}
    boolean lb2 = true;
    lb2 = ad1 > ad2;
    Thought lo3 = Thought197.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    fb0 = fb1 || lb2;
if(fo1 != null){
      ld1 = fo1.m3();
}
    Output.points[6][0] += ad1;
    fb0 = ad2 < ad3;
    fb1 = lb2 || fb0;
    ad4 = fd0 - fd1;
    fb1 = !lb2;
    double ld4 = 655.0450773955232;
    Thought lo5 = Thought282.getInstance(fb0, fb1, lb2, fb0);
    boolean lb6 = false;
    double ld7 = 496.93803098728483;
    Thought lo8 = Thought42.getInstance(fo0, fo1, fo0, fo1, ld1, ld4, ld7, ad1, fb0, fb1, lb2, lb6);
    fb0 = fb1 && lb2;

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
    ab2 = !ab3;
    ab4 = ad1 < ad2;
    Output.points[6][1] += ad3;
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
    boolean lb0 = false;
    ad3 *= -1;
    fb0 = !fb1;
    ad4 = fd0 + fd1;
    Output.points[6][2] += ad1;
    Thought lo1 = Thought123.getInstance(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
    ab4 = fd1 < ad1;
    fb0 = ad2 < ad3;
    Thought lo2 = Thought165.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
    ad4 = fd0 - fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
        double ld0 = 88.88704142017781;
    double ld1 = 620.1077092613716;
    double ld2 = 533.4831798982677;
    boolean lb3 = true;
    Output.points[6][3] += ld1;
    double ld4 = 72.25303006472133;

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
    boolean lb0 = true;
    Thought lo1 = Thought88.getInstance(ad1, ad2, ad3, ad4);
    lb0 = !fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
if(ao1 != null){
      ad4 = ao1.m3();
}
    fd0 = fd1 - ad1;
    boolean lb3 = true;
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb3, lb4, fb0, fb1);
}
    ad2 *= -1;
    lb0 = lb2 || lb3;
    lb4 = ad3 < ad4;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb2);
}
        lb3 = lb4 && fb0;
    boolean lb5 = false;
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
}
    ad1 *= -1;
    boolean lb6 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, lb3, lb4, lb5, lb6);
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
    ab1 = fd1 < fd0;
    ab2 = !ab3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
    boolean lb0 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    lb0 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
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
    double ld0 = 955.5465826060051;
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    ab1 = !ab2;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
    boolean lb1 = false;
    boolean lb2 = true;
    double ld3 = 581.5653136279059;
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
    ab2 = ld0 > ld3;
    Thought lo4 = Thought121.getInstance();
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2(ab3, ab4, fb0, fb1);
}
        Thought lo5 = Thought307.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb1, lb2, ab1, ab2);
        double ld6 = 294.0939854296285;
if(fo1 != null){
          ab3 = fo1.m2(ad4, fd0, fd1, ld6, ab4, fb0, fb1, lb1);
}
        Output.points[6][4] += ld0;
        Thought lo7 = Thought339.getInstance(ao1, ao2, ao3, ao4, lb2, ab1, ab2, ab3);
        ld3 *= -1;
if(fo0 != null){
          ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld6, ld0, ld3);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
        double ld8 = 889.6533541355093;
        fb1 = lb1 && lb2;
        ab1 = ld3 < ad1;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        fb1 = fb0 || fb1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        fb0 = fd0 > fd1;
        fd0 *= -1;
if(fo0 != null){
          fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        double ld0 = 848.4288673321701;
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb1 = false;
        lb1 = !fb0;
        Thought lo2 = Thought143.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
        lb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
        ld0 = fd0 - fd1;
        lb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb1);
}
        boolean lb3 = false;
        Thought lo4 = Thought375.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb3, fb0, fb1, lb1);
        fd0 = fd1 + ld0;
        fd0 = fd1 - ld0;
        fd0 = fd1 - ld0;
        lb3 = fd0 > fd1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    fb1 = lb0 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        fd0 *= -1;
    if (lb0) {
        ab1 = !ab2;
        boolean lb1 = true;
        if (ab2) {
            Thought lo2 = Thought135.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
            boolean lb3 = true;
            boolean lb4 = false;
            Thought lo5 = Thought338.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
              fo0.m1();
}
            boolean lb6 = false;
            double ld7 = 6.798803881788987;
            if (lb0) {
if(fo0 != null){
                  fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld7, fd0, fb0, fb1, lb3, lb4);
}
if(fo0 != null){
                  fo1 = fo0.m4(fd1, ld7, fd0, fd1, lb6, lb1, lb0, ab1);
}
                ab2 = !ab3;
                ab4 = ld7 > fd0;
                boolean lb8 = true;
                fd1 = ld7 + fd0;
}}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought226.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    double ld1 = 716.4806536887816;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought398.getInstance();
    fb0 = fb1 || fb0;
    fb1 = fd1 < ld1;
            fb0 = !fb1;
    ad1 = ad2 - ad3;
    fb0 = !fb1;
if(fo0 != null){
      ad4 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    double ld0 = 506.4235507028481;
    Output.points[6][5] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    ab1 = ad2 > ad3;
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    boolean lb1 = false;
    ab3 = ad4 > fd0;
    ab4 = fd1 < ld0;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    Output.points[6][6] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    Thought lo3 = Thought5.getInstance(fo1, fo0, fo1, fo0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[6][7] -= fd0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    Output.points[6][8] -= fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][0] += ad2;
    Thought lo0 = Thought65.getInstance(ao2, ao3, ao4, fo0);
    fb0 = !fb1;
    Output.points[7][1] += ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[7][2] -= fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = false;
    Thought lo1 = Thought197.getInstance(fd1, fd0, fd1, fd0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    fd1 *= -1;
    Thought lo2 = Thought112.getInstance(fb1, lb0, ab1, ab2);
    fd0 *= -1;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        Thought lo3 = Thought131.getInstance(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
        Output.points[7][3] += fd1;
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        }
    double ld4 = 863.5466240849894;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld4, fd0);
}
    ab4 = fb0 || fb1;
    lb0 = fd1 > ld4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld4, fd0);
}
    ab1 = !ab2;
    ab3 = fd1 < ld4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    Output.points[7][4] += ad2;
    ad3 = ad4 - fd0;
    ab2 = fd1 < ad1;
    ab3 = ad2 > ad3;
if(ao2 != null){
      ab4 = ao2.m2();
}
    boolean lb0 = false;
    Thought lo1 = Thought71.getInstance(ab4, fb0, fb1, lb0);
    if (ab1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        boolean lb2 = true;
        if (fb0) {
            ad2 = ad3 + ad4;
            fb1 = fd0 < fd1;
            Thought lo3 = Thought90.getInstance(ad1, ad2, ad3, ad4, lb2, lb0, ab1, ab2);
            fd0 = fd1 - ad1;
            Output.points[7][5] -= ad2;
            ab3 = ad3 < ad4;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb2);
}
}}
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
    fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    double ld1 = 212.49836038616493;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    boolean lb2 = false;
    lb2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb0, lb2);
}
    fb0 = ld1 > fd0;
    fb1 = fd1 < ld1;
    fd0 = fd1 - ld1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = !ab2;
    ab3 = fd0 > fd1;
    double ld1 = 438.9349028912974;
    ab4 = ld1 < fd0;
    fb0 = fb1 && lb0;
    ab1 = ab2 && ab3;
    fd1 = ld1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    ab1 = fd0 < fd1;
    Output.points[7][6] -= ld1;
    boolean lb2 = true;
    fd0 = fd1 + ld1;
    ab1 = fd0 < fd1;
    Thought lo3 = Thought254.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);

Thought.STACK_COUNTER++;
return ld1;
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
    double ld0 = 779.8418693106925;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 531.109518824166;
    ld1 = ad1 + ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fd0;
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
    ad2 = ad3 + ad4;
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought95.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
    boolean lb1 = true;
    Thought lo2 = Thought95.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb1 = ad1 < ad2;
    ab1 = ad3 > ad4;
    Thought lo3 = Thought140.getInstance();

Thought.STACK_COUNTER++;
return fd0;
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
    Output.points[7][7] -= fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought262.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
    Output.points[7][8] += fd0;
    fb0 = fb1 && fb0;
    double ld1 = 184.95525883355324;
    boolean lb2 = true;
    fb0 = fd0 > fd1;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb2, fb0, fb1);
}
    lb2 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb3 = true;
    lb3 = fb0 || fb1;
if(fo0 != null){
      lb2 = fo0.m2(ld1, fd0, fd1, ld1);
}
    Output.points[8][0] -= fd0;
    lb3 = fb0 && fb1;
    lb2 = fd1 > ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    boolean lb4 = false;
    Output.points[8][1] -= fd1;
    ld1 *= -1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo1.m3();
}

Thought.STACK_COUNTER++;
return fd0;
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
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    double ld0 = 83.67560372102962;
    ld0 = ad1 + ad2;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought91.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld2 = 236.5417831851328;
    fb1 = ld0 < ld2;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ad2 < ad3;
    Output.points[8][2] -= ad4;
    Output.points[8][3] -= fd0;
    fb1 = fb0 && fb1;
    double ld3 = 489.83010431173443;

Thought.STACK_COUNTER++;
return fd0;
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
    double ld0 = 899.5071703239901;
    ld0 = fd0 + fd1;
    ab1 = ld0 > fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ao2.m2(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
          fd1 = ao3.m3();
}
        Output.points[8][4] += ld0;
        ab2 = fd0 < fd1;
        ab3 = ab4 && fb0;
        fb1 = ld0 < fd0;
        }
    fd1 = ld0 - fd0;
    ab1 = fd1 > ld0;
    double ld1 = 34.438996841226164;
    ab2 = ld1 < fd0;
    Output.points[8][5] -= fd1;
    Output.points[8][6] += ld0;
    ab3 = ab4 && fb0;

Thought.STACK_COUNTER++;
return ld1;
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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought338.getInstance(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
    double ld2 = 577.5710634517276;
    double ld3 = 627.0742361075546;
    ad3 = ad4 - fd0;
    boolean lb4 = false;
    ab3 = fd1 > ld2;
if(ao2 != null){
          ld3 = ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld5 = 481.1292230577935;
    ld5 *= -1;
    double ld6 = 176.06438471546744;
if(ao1 != null){
      ao1.m1(ld6, ad1, ad2, ad3);
}
    Output.points[8][7] += ad4;
    boolean lb7 = false;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ld3);
}
    ld5 = ld6 + ad1;
    boolean lb8 = true;

Thought.STACK_COUNTER++;
return ad2;
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
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    double ld0 = 500.38563961368664;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    fb1 = ld0 < fd0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}

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
      fo1.m2();
}
    ab1 = fd1 > fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    ab1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld2 = 708.6531710002338;
if(fo0 != null){
      ab2 = fo0.m2(ld2, fd0, fd1, ld2);
}
    ab3 = ab4 && fb0;
    fb1 = fd0 < fd1;
    lb0 = !lb1;
    boolean lb3 = false;
    ld2 = fd0 + fd1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    lb3 = !ab1;
    Thought lo4 = Thought15.getInstance();
    fd1 *= -1;
    Output.points[8][8] -= ld2;
    boolean lb5 = true;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
        lb0 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
        fb0 = fd1 > ad1;
        double ld1 = 538.9807441888618;
        Thought lo2 = Thought143.getInstance(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
        Thought lo3 = Thought253.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
        for(int i1=0; i1<10; i1++){
            Thought lo4 = Thought334.getInstance(fo1, fo0, fo1, fo0);
            fd0 = fd1 - ld1;
            Output.points[0][0] += ad1;
            fb0 = !fb1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb4 = true;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][1] -= fd1;
if(fo0 != null){
      fo0.m1(lb0, lb1, lb2, lb3);
}
    lb4 = ab1 || ab2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, lb0, lb1, lb2, lb3);
}
    lb4 = ad3 < ad4;
    double ld5 = 170.8680380322145;
        Thought lo6 = Thought312.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld5);
}
    Thought lo7 = Thought293.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
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
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 912.0392992086183;
    Thought lo1 = Thought392.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > ld0;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Thought lo2 = Thought158.getInstance();
    fb0 = fb1 && fb0;

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
    Output.points[0][2] += ad1;
    Thought lo0 = Thought288.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad2 > ad3;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought4.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    boolean lb3 = true;
    fd0 = fd1 - ad1;
    Thought lo4 = Thought364.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    double ld5 = 327.92489767411166;
    lb1 = lb3 && fb0;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1();
}
    double ld6 = 357.7659280949633;
    fd0 = fd1 - ld5;

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
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
    fb1 = ab1 && ab2;
    Output.points[0][3] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    double ld0 = 493.54816399201064;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1);
}
    boolean lb1 = false;
    Thought lo2 = Thought56.getInstance(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
if(ao2 != null){
      ao1 = ao2.m4();
}

Thought.STACK_COUNTER++;
return ao3;
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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 + ad2;
    double ld0 = 516.1318762899109;
    ab3 = ad2 > ad3;
    ad4 *= -1;
if(ao4 != null){
      ao4.m1(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
}
    Output.points[0][4] += ad2;
    double ld1 = 165.1414991794802;
    Output.points[0][5] -= ad2;
    ab2 = ad3 > ad4;
    fd0 = fd1 + ld0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ld1 = ad1 + ad2;
    double ld2 = 269.957053402625;
    ab4 = ad2 > ad3;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
        double ld3 = 36.720465390356495;
if(fo0 != null){
          ao4 = fo0.m4(ad4, fd0, fd1, ld3);
}
        ld0 = ld1 + ld2;
        ad1 = ad2 - ad3;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3);
}
}
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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought97.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 909.373312046365;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1);
}
    fb0 = ld1 < fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    double ld0 = 736.7492590789666;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought282.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 = fd0 - fd1;

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
    double ld0 = 974.2676236508466;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought233.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    double ld3 = 981.541604840306;
    fb0 = fb1 && lb2;
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld0, ld3);
}
    fb0 = fd0 < fd1;
    double ld4 = 671.2680276220071;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld3, ld4, fd0);
}
    Output.points[0][6] -= fd1;
    fb1 = ld0 < ld3;
    lb2 = ld4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd1 < ld0;

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
