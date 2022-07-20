package genetic;
import java.util.ArrayList;
class Thought304 extends Thought{
private static ArrayList<Thought304> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 711.8842901743457;
private double fd1 = 12.311000044398385;
private Thought fo0 = null;
private Thought fo1 = null;
Thought304 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought304 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought304 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought304 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought304 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought304 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought304 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought304 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought304 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought304 instance = new Thought304 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought304 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought304 instance = new Thought304 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought304 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought304 instance = new Thought304 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought304 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought304 instance = new Thought304 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought304 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought304 instance = new Thought304 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought304 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought304 instance = new Thought304 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought304 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought304 instance = new Thought304 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought304 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought304 instance = new Thought304 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 445.6011492243718;
    if (fb1) {
        double ld1 = 783.3983709561921;
if(fo1 != null){
          fo1.m3();
}
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
    double ld0 = 78.83209799519294;
    ld0 *= -1;
    ab1 = fd0 < fd1;
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
    ab2 = ld0 > fd0;
    ab3 = fd1 > ld0;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    ab1 = ld0 > fd0;
    ab2 = !ab3;
    Thought lo1 = Thought9.getInstance(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
    ab2 = ld0 < fd0;
    fd1 = ld0 + fd0;
    Output.points[5][5] -= fd1;
    boolean lb2 = false;
    double ld3 = 666.1982192812109;

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
    ad1 = ad2 - ad3;
    double ld0 = 16.57530558184625;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
        fb0 = fd1 < ld0;
    fb1 = ad1 > ad2;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 *= -1;
    ad4 *= -1;
    double ld1 = 926.5265527677867;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    Output.points[5][6] -= ld1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    fb0 = fd0 > fd1;
    Thought lo3 = Thought290.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, fb1, lb2, fb0, fb1);

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
    Output.points[5][7] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    ab4 = fb0 || fb1;
    boolean lb1 = false;
        Thought lo2 = Thought116.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 && fb0;
    Thought lo3 = Thought161.getInstance(fd1, ad1, ad2, ad3);
    double ld4 = 729.5452316420912;
    fb1 = ad3 > ad4;
    boolean lb5 = true;
    fd0 *= -1;
    lb0 = fd1 < ld4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought108.getInstance();
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = lb1 && lb2;
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
        lb3 = fd0 < fd1;
        Thought lo4 = Thought299.getInstance(fd0, fd1, fd0, fd1);
        fb0 = fd0 < fd1;
        fb1 = fd0 < fd1;
        fd0 = fd1 - fd0;
        lb1 = fd1 < fd0;
        double ld5 = 127.36622913919042;
        lb2 = fd0 < fd1;
if(fo0 != null){
          ld5 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld5, fd0);
}
        lb3 = !fb0;
        for(int i1=0; i1<10; i1++){
if(ao4 != null){
              ao4.m3();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought37.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
    fd0 = fd1 + ad1;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[5][8] += fd1;
    double ld1 = 887.5064440592498;
    fb1 = ld1 < ad1;
    fb0 = ad2 < ad3;
    Thought lo2 = Thought278.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
    fb1 = ad1 > ad2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    double ld3 = 330.30547932085017;
    ld1 *= -1;
    boolean lb4 = true;
    ld3 = ad1 + ad2;

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
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Thought lo0 = Thought87.getInstance(ao1, ao2, ao3, ao4);
    fb1 = ab1 || ab2;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        ab3 = fd1 > fd0;
        ab4 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fb1 = !ab1;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        fd1 = fd0 - fd1;
        ab2 = ab3 || ab4;
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
    ab1 = ab2 && ab3;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao3 != null){
      fb0 = ao3.m2(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
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
        fb1 = fb0 && fb1;
        fd0 = fd1 + fd0;
        boolean lb0 = true;
        Thought lo1 = Thought110.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
        boolean lb2 = false;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            lb2 = fb0 && fb1;
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
            fd0 = fd1 - fd0;
            lb0 = fd1 < fd0;
            Thought lo3 = Thought12.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
            Output.points[6][0] += fd1;
            }
        Thought lo4 = Thought379.getInstance();
        double ld5 = 355.6722612057579;
        lb2 = !fb0;
        Output.points[6][1] -= ld5;
        fb1 = !lb0;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought294.getInstance(lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought308.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[6][2] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb0) {
        double ld3 = 581.5078802454524;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
          ld3 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 && ab2;
if(fo1 != null){
          fo1.m2(fd1, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
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
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
        ad2 *= -1;
if(fo0 != null){
          fb1 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        if (fb0) {
            Output.points[6][3] -= ad3;
            fb1 = !fb0;
            ad4 *= -1;
            fb1 = fb0 && fb1;
            fb0 = fb1 || fb0;
if(fo1 != null){
              fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
            Output.points[6][4] += ad3;
            boolean lb0 = true;
if(fo1 != null){
              fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
            fb0 = fb1 || lb0;
            fb0 = !fb1;
            Output.points[6][5] += ad2;
            lb0 = fb0 && fb1;
            for(int i1=0; i1<10; i1++){
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
}}}
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
    ab1 = !ab2;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld0 = 639.37331516851;
    boolean lb1 = false;
    double ld2 = 492.89526433374914;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb4 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 = ad3 + ad4;
    lb4 = ab1 || ab2;
    double ld5 = 27.88309903991782;
    double ld6 = 420.18285233458624;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    boolean lb7 = true;
    lb1 = lb3 && lb4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ld5, lb7, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(ld6, ad1, ad2, ad3, fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, lb7, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        double ld8 = 854.0629941173024;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[6][6] -= ad3;
        ab3 = ad4 > fd0;
        ab4 = fb0 || fb1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought123.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb1 = true;
    Thought lo2 = Thought11.getInstance();
    boolean lb3 = false;
    lb3 = fd0 < fd1;
    boolean lb4 = false;
    boolean lb5 = true;
    Output.points[6][7] -= fd0;
    boolean lb6 = false;
    boolean lb7 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought223.getInstance(ao4, fo0, fo1, ao1);
    ad1 = ad2 - ad3;
    Thought lo1 = Thought357.getInstance(ad4, fd0, fd1, ad1);
    fb1 = ad2 > ad3;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo2 = Thought50.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    fb1 = fb0 || fb1;
    ad3 *= -1;
    fb0 = fb1 || fb0;
    ad4 = fd0 - fd1;
    fb1 = fb0 && fb1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;

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
      ab1 = ao2.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab3 = ab4 || fb0;
    boolean lb1 = true;
if(ao2 != null){
      fb0 = ao2.m2(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought113.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m3();
}
    fb1 = fd1 < fd0;
    lb0 = lb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, lb3, ab1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb4 = false;
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought368.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    boolean lb1 = false;
    fd0 *= -1;
    ab1 = !ab2;
    fd1 = ad1 - ad2;
    boolean lb2 = true;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb3 = true;
    ab4 = ad3 > ad4;
    double ld4 = 345.72249298752155;
if(ao2 != null){
      ao2.m2(fb0, fb1, lb1, lb2);
}
    double ld5 = 918.7456261136383;
    boolean lb6 = true;
    Thought lo7 = Thought118.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb3, lb6, ab1, ab2);
if(ao1 != null){
      ao1.m3(ld4, ld5, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
    ad4 *= -1;
    lb1 = lb2 && lb3;
    lb6 = ab1 && ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    lb1 = fd0 < fd1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought4.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    Output.points[6][8] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    double ld1 = 547.0455701094404;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 > fd0;
    Output.points[7][0] += fd1;
    double ld2 = 121.7078143919674;
    fb0 = fb1 && fb0;
    ld1 = ld2 + fd0;
    Output.points[7][1] -= fd1;
        ld1 = ld2 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld2, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld1 - ld2;
    fd0 *= -1;
        Thought lo3 = Thought87.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    if (fb1) {
        Output.points[7][2] += fd1;
        Thought lo4 = Thought285.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m3(ld1, ld2, fd0, fd1);
}
        Thought lo5 = Thought53.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld6 = 218.03326346405717;
        Output.points[7][3] += ld6;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    double ld0 = 858.1407280633963;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ld0 = fd0 + fd1;
    ab2 = ld0 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    ld0 = fd0 - fd1;
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = ld0 > fd0;
    Output.points[7][4] -= fd1;
        fb0 = ld0 > fd0;
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    ab1 = !ab2;
    boolean lb1 = false;
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2();
}
    double ld2 = 643.2018660384335;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(ab4, fb0, fb1, lb1);
}
    boolean lb4 = true;
    fd0 = fd1 + ld0;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, lb3, lb4, ab1, ab2);
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought210.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought233.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = !fb0;
    fb1 = ad2 > ad3;
    boolean lb2 = true;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought112.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb2, fb0);
}
    boolean lb4 = true;
    double ld5 = 962.1884788147372;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb2, lb4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld5;
    fb1 = ad1 > ad2;
    lb2 = !lb4;
    boolean lb6 = true;
    lb6 = fb0 && fb1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld5);
}
    boolean lb7 = true;
    lb2 = !lb4;

Thought.STACK_COUNTER++;
return ad1;
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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab1 = ab2 && ab3;
    Output.points[7][5] += ad2;
    ab4 = ad3 > ad4;
    fd0 = fd1 - ad1;
    double ld0 = 122.41069569173935;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fd0 = fd1 + fd0;
    Output.points[7][6] -= fd1;
    Thought lo0 = Thought237.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Output.points[7][7] -= fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    boolean lb1 = true;
        fb0 = fb1 && lb1;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    double ld3 = 664.2280025819571;
    if (lb2) {
        fd0 = fd1 + ld3;
        fb0 = fd0 > fd1;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 *= -1;
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ad4 = ao1.m3();
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;

Thought.STACK_COUNTER++;
return ad1;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !ab1;
    fd1 = fd0 - fd1;
    ab2 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab3 = !ab4;
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3();
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m3(fb0, fb1, ab1, ab2);
}
        boolean lb0 = false;
        Output.points[7][8] -= fd0;
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
        double ld1 = 810.8415342213608;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought365.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
        ab3 = fd1 > ld1;
        ab4 = !fb0;
        fb1 = lb0 && ab1;
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Output.points[8][0] += fd0;
        fd1 *= -1;
        ld1 *= -1;
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
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought295.getInstance(ad4, fd0, fd1, ad1);
    for(int i0=0; i0<10; i0++){
        double ld2 = 746.8597098579899;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        ab1 = ab2 && ab3;
        fd0 = fd1 - ld2;
        ad1 *= -1;
        }
    ab4 = fb0 || fb1;
    for(int i1=0; i1<10; i1++){
if(fo1 != null){
          ad3 = fo1.m3();
}
        Thought lo3 = Thought113.getInstance(lb0, ab1, ab2, ab3);
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
        }
    ab1 = ab2 && ab3;

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
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb3 = false;
    lb2 = fd0 < fd1;
    lb3 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
    double ld4 = 147.99502075214983;
    ld4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb3 = ld4 < fd0;
    fd1 = ld4 - fd0;
    boolean lb5 = false;
    lb5 = fd1 < ld4;
    Thought lo6 = Thought312.getInstance(fd0, fd1, ld4, fd0);
    fb0 = fd1 < ld4;
    fb1 = fd0 < fd1;
    lb0 = lb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4);
}
    lb3 = fd0 > fd1;
if(fo0 != null){
      ld4 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb5, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        lb1 = fd0 > fd1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4, lb2, lb3, lb5, fb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld0 = 976.0434021741992;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    fb1 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = !ab3;
    ld0 *= -1;
if(fo0 != null){
      fo0.m3(ab4, fb0, fb1, lb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, lb1, lb2, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, ab1);
}
    Thought lo3 = Thought108.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    boolean lb4 = false;
    fd0 *= -1;

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
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought76.getInstance();
    fb1 = ad2 < ad3;
    fb0 = !fb1;
            boolean lb1 = false;
    lb1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought371.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, fb1, lb1, fb0, fb1);
}
    lb1 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb1 || fb0;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Output.points[8][1] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3();
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
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        ab1 = ab2 && ab3;
        ab4 = fd0 > fd1;
        Thought lo0 = Thought190.getInstance(fb0, fb1, ab1, ab2);
        }
    if (ab3) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        fd0 = fd1 - ad1;
        if (ab2) {
            } else {
            ad2 *= -1;
if(fo0 != null){
              fo0.m1(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
            boolean lb1 = true;
            ab4 = ad1 < ad2;
            fb0 = !fb1;
            boolean lb2 = true;
            ad3 *= -1;
if(fo1 != null){
                          ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
            if (lb1) {
                lb2 = ab1 && ab2;
                Output.points[8][2] -= fd0;
if(fo1 != null){
                  fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
}}}
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
    Thought lo0 = Thought332.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    Thought lo1 = Thought189.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        Output.points[8][3] += fd0;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb2, lb3, fb0, fb1);
}
    fd0 = fd1 - fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought388.getInstance(ad2, ad3, ad4, fd0);
    Output.points[8][4] += fd1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    boolean lb1 = false;
    fb0 = ad3 < ad4;
    fb1 = fd0 > fd1;
    Thought lo2 = Thought265.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + ad1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    Thought lo3 = Thought68.getInstance(ao3, ao4, fo0, fo1);

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
    ab2 = fd0 < fd1;
    ab3 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 174.8830320326719;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
if(ao4 != null){
      ab4 = ao4.m2();
}
        fb0 = !fb1;
    fd0 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Thought lo1 = Thought386.getInstance(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao4 != null){
      ab1 = ao4.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
    boolean lb2 = true;
    ab3 = ab4 || fb0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = lb2 && ab1;
    boolean lb3 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought2.getInstance(ad1, ad2, ad3, ad4);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
        ab1 = ab2 && ab3;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought86.getInstance(ab4, fb0, fb1, ab1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[8][5] -= ad3;
    ab4 = fb0 || fb1;
    ab1 = ad4 < fd0;

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
      fo0.m1(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    double ld1 = 124.46361681460759;
    ld1 *= -1;
    fb0 = fd0 < fd1;
    Output.points[8][6] += ld1;
    fb1 = lb0 && fb0;
    boolean lb2 = false;
    double ld3 = 426.00644134207175;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
          ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld1;

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
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo0 = Thought278.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld1 = 466.13249002813893;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb2);
}
    Thought lo3 = Thought239.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
    double ld4 = 441.83119431129325;
    boolean lb5 = true;
    fb0 = ld4 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = ld1 + ld4;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, ld4);
}
    lb2 = fd0 > fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
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
    fd1 *= -1;
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    Thought lo0 = Thought382.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought228.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld2 = 79.30607861183701;
    double ld3 = 420.382709800132;
    ld2 = ld3 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld2, ld3, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld3, fd0, fd1);
}
    fb0 = ld2 > ld3;
    double ld4 = 146.06510071164885;
        boolean lb5 = true;
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
}
