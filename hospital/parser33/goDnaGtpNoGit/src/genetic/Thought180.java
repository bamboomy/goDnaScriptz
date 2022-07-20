package genetic;
import java.util.ArrayList;
class Thought180 extends Thought{
private static ArrayList<Thought180> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 498.50954685928843;
private double fd1 = 863.7724901611214;
private Thought fo0 = null;
private Thought fo1 = null;
Thought180 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought180 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought180 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought180 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought180 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought180 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought180 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought180 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought180 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought180 instance = new Thought180 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought180 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought180 instance = new Thought180 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought180 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought180 instance = new Thought180 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought180 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought180 instance = new Thought180 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought180 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought180 instance = new Thought180 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought180 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought180 instance = new Thought180 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought180 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought180 instance = new Thought180 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought180 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought180 instance = new Thought180 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = false;
    Output.points[1][6] += fd1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
        fd0 *= -1;
        Thought lo1 = Thought322.getInstance(fo1, fo0, fo1, fo0);
        fb0 = !fb1;
        double ld2 = 732.7152633169018;
        fd0 *= -1;
        boolean lb3 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
        fd0 *= -1;
        lb3 = lb0 && fb0;
        double ld4 = 544.1951111383515;
if(fo0 != null){
          fd0 = fo0.m3();
}
        if (fb1) {
            double ld5 = 653.1958610957909;
if(fo1 != null){
              fd0 = fo1.m3(lb3, lb0, fb0, fb1);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;

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
    double ld0 = 0.8639876613939643;
    fb1 = fb0 && fb1;
    fb0 = ld0 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ad1, ad2);
}
    Thought lo3 = Thought232.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    lb1 = ld0 > ad1;
if(fo1 != null){
      lb2 = fo1.m2();
}
    boolean lb4 = true;
    lb4 = fb0 || fb1;
    lb1 = ad2 < ad3;
    for(int i0=0; i0<10; i0++){
        lb2 = ad4 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(lb4, fb0, fb1, lb1);
}
        lb2 = lb4 && fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, lb1, lb2, lb4);
}
        Output.points[1][7] -= ad3;
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
        ad1 *= -1;
if(fo1 != null){
          lb4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
        boolean lb5 = true;
        boolean lb6 = false;
        lb1 = lb2 || lb4;
        ad2 = ad3 - ad4;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought15.getInstance();
    boolean lb1 = true;
    double ld2 = 468.4511693096066;
    Output.points[1][8] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(lb1, ab1, ab2, ab3);
}
    Output.points[2][0] += ad3;
    ad4 = fd0 + fd1;
    ab4 = !fb0;
    ld2 = ad1 + ad2;
    fb1 = !lb1;
    ab1 = ad3 < ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
}
    double ld3 = 596.1510465420831;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    lb1 = ld3 < ad1;
    boolean lb4 = false;
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld2;
        lb4 = ld3 > ad1;
if(fo0 != null){
          ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
        double ld5 = 180.18308830320868;
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
    Output.points[2][1] += fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    Output.points[2][2] += fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[2][3] += fd1;
        Thought lo0 = Thought201.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao2 != null){
          fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
        boolean lb1 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
        fd0 = fd1 + fd0;
        boolean lb2 = false;
        fd1 *= -1;
        lb2 = fb0 || fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought319.getInstance(ao1, ao2, ao3, ao4);
    ad1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    double ld1 = 66.41495276483101;
    fb0 = !fb1;
    fb0 = ad1 < ad2;
    boolean lb2 = true;
    Thought lo3 = Thought305.getInstance(ad3, ad4, fd0, fd1);
    ld1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    if (ab2) {
        for(int i0=0; i0<10; i0++){
            Thought lo0 = Thought333.getInstance();
if(ao2 != null){
              ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
              ao3.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
            ab3 = fd1 > fd0;
            Thought lo1 = Thought108.getInstance(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
              ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
            ab2 = ab3 && ab4;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
              ao4 = fo0.m4();
}
            boolean lb2 = true;
            fd1 = fd0 + fd1;
            double ld3 = 993.4774574838622;
if(fo1 != null){
              fo1.m2(ab4, fb0, fb1, lb2);
}
            ab1 = ld3 < fd0;
            boolean lb4 = false;
if(ao1 != null){
              fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
            boolean lb5 = true;
if(ao1 != null){
              fo1 = ao1.m4(fd0, fd1, ld3, fd0, ab4, fb0, fb1, lb2);
}
            lb4 = !lb5;
            Output.points[2][4] += fd1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
            fb0 = ld3 > fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought89.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = true;
        boolean lb2 = true;
    lb1 = ad1 < ad2;
    ad3 = ad4 - fd0;
    lb2 = fd1 < ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    ab1 = ad4 > fd0;
    Output.points[2][5] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = ab3 || ab4;
    Output.points[2][6] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb1, lb2, ab1);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb1, lb1, lb2, ab1);
}
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought91.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
    boolean lb4 = true;
    ad4 = fd0 + fd1;

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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[2][7] += fd0;
    fd1 *= -1;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    double ld1 = 746.1814029078616;
if(fo1 != null){
      lb0 = fo1.m2();
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
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[2][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;

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
    Output.points[3][0] += ad1;
    fb0 = !fb1;
    Thought lo0 = Thought13.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    Output.points[3][1] += fd1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fd0 = fd1 - ad1;
    Output.points[3][2] += ad2;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    ad3 *= -1;
    fb1 = fb0 || fb1;
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return lb1;
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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    Output.points[3][3] -= ad4;
    Thought lo0 = Thought72.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        boolean lb2 = false;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo0.m3();
}
        ab4 = ad3 < ad4;
        fd0 = fd1 + ad1;
        if (fb0) {
            ad2 = ad3 - ad4;
}}
Thought.STACK_COUNTER++;
return ab2;
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
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    Output.points[3][4] += fd0;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    double ld0 = 666.6235376217954;
    double ld1 = 106.00168135807162;
    fb1 = fb0 || fb1;
    fb0 = ld1 > fd0;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ld1, fd0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 954.0685584271922;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    double ld1 = 462.7169726418435;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld2 = 383.9885578633543;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Output.points[3][5] -= ad3;
    ad4 *= -1;
    Thought lo3 = Thought127.getInstance(ao3, ao4, fo0, fo1);
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Thought lo4 = Thought147.getInstance(fd0, fd1, ld0, ld1);
    if (fb1) {
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
    double ld0 = 635.091439866086;
    ab2 = !ab3;
    double ld1 = 251.27869208891235;
    ld0 = ld1 - fd0;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, ld1, fd0);
}
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ld0, ld1, fd0, fd1, fb1, lb2, ab1, ab2);
}
    Thought lo3 = Thought220.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
    ld0 = ld1 - fd0;
    fd1 = ld0 - ld1;
    fd0 = fd1 + ld0;
    ld1 = fd0 - fd1;
    Thought lo4 = Thought42.getInstance(ao2, ao3, ao4, fo0);
    double ld5 = 566.1560185650965;
    double ld6 = 17.533028689749866;
    lb2 = ld0 > ld1;
    ab1 = ab2 && ab3;
    if (ab4) {
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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
    Output.points[3][6] -= fd1;
    boolean lb0 = true;
if(ao4 != null){
      ao4.m1();
}
    Output.points[3][7] -= ad1;
    ab3 = !ab4;
    fb0 = !fb1;
    boolean lb1 = true;
    Output.points[3][8] += ad2;
    lb0 = !lb1;
if(fo0 != null){
      fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ab1 = ad1 > ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[4][0] += ad1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][1] -= fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought48.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[4][2] += fd0;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        lb1 = fb0 && fb1;
        boolean lb2 = true;
        fd1 = fd0 + fd1;
        boolean lb3 = true;
        lb2 = lb3 || lb1;
        Thought lo4 = Thought119.getInstance();
        boolean lb5 = true;
        lb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m3(lb2, lb3, lb5, lb1);
}
        fd0 *= -1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb3);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb5, lb1, fb0, fb1);
}
        lb2 = lb3 || lb5;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb2);
}
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0);
}
        lb5 = lb1 && fb0;
        fb1 = !lb2;
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
    ab2 = !ab3;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        fd0 = fd1 - fd0;
        ab1 = ab2 || ab3;
        ab4 = fb0 || fb1;
if(fo1 != null){
          ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ad1, ad2);
}
    double ld0 = 14.25149273161844;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld1 = 480.01275856118514;
    Output.points[4][3] += fd0;
    fb1 = fd1 < ld0;
    fb0 = ld1 > ad1;
    Thought lo2 = Thought226.getInstance(fb1, fb0, fb1, fb0);

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    ad1 = ad2 - ad3;
    Output.points[4][4] += ad4;
    Thought lo0 = Thought174.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
    boolean lb1 = true;
    boolean lb2 = true;
    double ld3 = 807.0680307808594;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    double ld4 = 998.1391190107603;
    lb1 = lb2 && ab1;

Thought.STACK_COUNTER++;
return ld3;
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
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[4][5] -= fd1;
    double ld0 = 722.4076885403831;
    boolean lb1 = false;
    Output.points[4][6] += ld0;
    double ld2 = 154.83407533555027;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ld2 = fd0 - fd1;
if(ao1 != null){
      ao1.m3(ld0, ld2, fd0, fd1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld0);
}
    fb0 = !fb1;
    lb1 = ld2 > fd0;
    if (fb0) {
        fd1 = ld0 - ld2;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fb1 = fd0 > fd1;
        lb1 = fb0 && fb1;
        lb1 = fb0 && fb1;
        lb1 = !fb0;
        fb1 = lb1 || fb0;
        Output.points[4][7] -= ld0;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    Thought lo0 = Thought292.getInstance(ao3, ao4, fo0, fo1);
    boolean lb1 = true;
    lb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    lb1 = ad1 < ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 = ad3 - ad4;
    boolean lb2 = true;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(lb2, fb0, fb1, lb1);
}
    fd1 = ad1 - ad2;
    lb2 = fb0 && fb1;

Thought.STACK_COUNTER++;
return ad3;
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
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought101.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    Output.points[4][8] -= fd1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 200.58474962983993;
    ld1 = fd0 - fd1;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
    ab1 = !ab2;
    fd0 = fd1 - ld1;
    double ld3 = 922.6375100499157;
    ab3 = ab4 || fb0;
    Thought lo4 = Thought353.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb2, ab1, ab2);
}
    Thought lo5 = Thought13.getInstance(fo0, fo1, ao1, ao2, ld3, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
    Thought lo6 = Thought40.getInstance(ld3, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
    boolean lb7 = false;
    Output.points[5][0] -= ld3;
    ab3 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb2);
}
    ld1 *= -1;
    lb7 = ld3 > fd0;
    fd1 *= -1;
    boolean lb8 = false;
    Output.points[5][1] += ld1;

Thought.STACK_COUNTER++;
return ld3;
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
        double ld0 = 582.7686614783312;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought62.getInstance(ad1, ad2, ad3, ad4);
    ab1 = fd0 > fd1;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
}
    boolean lb2 = false;
    ad4 = fd0 + fd1;
    double ld3 = 856.5207349992769;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb2, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ld3, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = !lb2;
    Thought lo4 = Thought325.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    Thought lo5 = Thought285.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb2, ab1);
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld3, ad1, ad2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    boolean lb6 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[5][2] -= ld0;
if(ao4 != null){
      ab3 = ao4.m2(ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld3, ad1, ad2, ad3, lb6, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld3, ad1, fb0, fb1, lb2, lb6);
}

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
    fb0 = fb1 || fb0;
    double ld0 = 996.9914923553038;
    Output.points[5][3] += ld0;
    Output.points[5][4] -= fd0;
    fb1 = fd1 < ld0;
        fb0 = fd0 > fd1;
    Output.points[5][5] -= ld0;
    double ld1 = 936.0642586809076;
    ld1 = fd0 + fd1;
    fb1 = ld0 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    if (fb1) {
        boolean lb2 = false;
        boolean lb3 = true;
        lb2 = fd1 < ld0;
        double ld4 = 361.8072320183203;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = !ab1;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[5][6] += fd1;
if(fo1 != null){
      lb2 = fo1.m2();
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
    boolean lb3 = true;
    double ld4 = 612.249965384393;

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
    fb1 = fb0 || fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad3 > ad4;
    Output.points[5][7] += fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 884.3598960711204;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Output.points[5][8] -= ad1;
    Output.points[6][0] += ad2;
    Thought lo1 = Thought255.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ld0 *= -1;
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
    Thought lo2 = Thought315.getInstance(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    lb3 = ld0 > ad1;
    ad2 = ad3 + ad4;
    boolean lb4 = false;
    fd0 = fd1 + ld0;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ad1 - ad2;
    boolean lb0 = false;
    boolean lb1 = false;
    ab3 = ad3 > ad4;
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
    Thought lo2 = Thought103.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
    ab4 = ad1 > ad2;
    fb0 = ad3 < ad4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought197.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    if (fb0) {
        fd0 = fd1 + fd0;
        fd1 *= -1;
        fb1 = fb0 && fb1;
        double ld1 = 5.420189869680685;
        Output.points[6][1] -= ld1;
        Thought lo2 = Thought2.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
        fd0 *= -1;
        fd1 = ld1 + fd0;
        fb0 = fb1 && fb0;
        double ld3 = 91.75267476006195;
        Thought lo4 = Thought84.getInstance(fo1, ao1, ao2, ao3);
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 *= -1;
    double ld0 = 286.00051308182503;
    fb1 = !fb0;
    fb1 = ad4 > fd0;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = false;
    fd1 = ld0 + ad1;
    boolean lb3 = true;
    lb1 = !lb2;
    lb3 = ad2 < ad3;
    fb0 = fb1 || lb1;
    ad4 = fd0 + fd1;
    ld0 *= -1;
    lb2 = !lb3;

Thought.STACK_COUNTER++;
return ao4;
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
    Output.points[6][2] += fd1;
    double ld0 = 528.9497373085217;
    ld0 = fd0 + fd1;
    ab2 = ld0 < fd0;
    ab3 = fd1 > ld0;
    Thought lo1 = Thought318.getInstance(ab4, fb0, fb1, ab1);
    Thought lo2 = Thought344.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m3(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ab4 = ld0 > fd0;
    fd1 = ld0 - fd0;
    Thought lo3 = Thought148.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
    Thought lo4 = Thought54.getInstance(ao4, fo0, fo1, ao1);
    fd1 *= -1;
        ab3 = ab4 || fb0;
if(ao2 != null){
      ao2.m2(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    Output.points[6][3] += fd1;
if(ao2 != null){
      ao2.m2();
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
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
    Output.points[6][4] += fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    fb0 = !fb1;
    lb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ab1 = ad2 < ad3;
if(ao3 != null){
      ab2 = ao3.m2(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    ab4 = fb0 || fb1;
    ad1 = ad2 - ad3;
    double ld1 = 385.33048482389455;
    lb0 = ab1 && ab2;
    Output.points[6][5] -= ad3;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    lb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
    Thought lo1 = Thought302.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld2 = 892.459715465171;
    Thought lo3 = Thought195.getInstance();
    fd0 *= -1;
    boolean lb4 = false;
if(fo0 != null){
      fd1 = fo0.m3(lb4, fb0, fb1, lb0);
}
    ld2 = fd0 + fd1;
    boolean lb5 = false;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, lb5, fb0, fb1, lb0);
}
    fd0 = fd1 + ld2;
    lb4 = !lb5;

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
    boolean lb0 = true;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    lb0 = fd1 < fd0;
    fd1 *= -1;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    double ld3 = 563.3117727009922;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
    lb1 = fd1 > ld3;
    lb2 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb0, fb1, lb0, lb1);
}
    lb2 = fd0 > fd1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3, lb4, fb0, fb1, lb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    double ld1 = 378.9071728959656;
    Thought lo2 = Thought84.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    ld1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ld1, fd0, fd1, ld1);
}
    lb0 = !fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;

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
